package com.example.naturerb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="Nerb.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
    String strSql = "CREATE TABLE `corps` (\n" +
            "  `ID_Corps` int(11) NOT NULL,\n" +
            "  `LibelleCorps` text DEFAULT NULL );"+


            "CREATE TABLE `corpssymptomes` (\n" +
                "  `ID_Corps` int(11) NOT NULL,\n" +
                "  `ID_Symptomes` int(11) NOT NULL\n );"+

             "CREATE TABLE `remedes` (\n" +
            "  `ID_Remedes` int(11) NOT NULL,\n" +
            "  `LibelleRemedes` text DEFAULT NULL,\n" +
            "  `recette` varchar(500) NOT NULL,\n" +
            "  `Proprietes` varchar(500) NOT NULL,\n" +
            "  `Sources` varchar(500) NOT NULL,\n" +
            "  `ID_Symptomes` int(11) DEFAULT NULL\n );"+

            "CREATE TABLE `symptomes` (\n" +
            "  `ID_Symptomes` int(11) NOT NULL,\n" +
            "  `LibelleSymptomes` text DEFAULT NULL\n )";

            db.execSQL( strSql );
            insert();
        Log.i("DATABASE", "onCreate invoked");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insert(){
        String strSql = "INSERT INTO `corps` (`ID_Corps`, `LibelleCorps`) VALUES\n" +
                "(1, 'Tête'),\n" +
                "(2, 'Ventre'),\n" +
                "(3, 'Bras'),\n" +
                "(4, 'Jambes'));"+

                "INSERT INTO `corpssymptomes` (`ID_Corps`, `ID_Symptomes`) VALUES\n" +
                "(1, 11),\n" +
                "(1, 12),\n" +
                "(1, 13),\n" +
                "(1, 14),\n" +
                "(1, 15),\n" +
                "(1, 16),\n" +
                "(1, 18),\n" +
                "(1, 19),\n" +
                "(2, 16),\n" +
                "(2, 18),\n" +
                "(2, 19),\n" +
                "(2, 20),\n" +
                "(3, 16),\n" +
                "(3, 18),\n" +
                "(3, 19),\n" +
                "(4, 16),\n" +
                "(4, 17),\n" +
                "(4, 18),\n" +
                "(4, 19);" +

                "INSERT INTO `remedes` (`ID_Remedes`, `LibelleRemedes`, `recette`, `Proprietes`, `Sources`, `ID_Symptomes`) VALUES\n" +
                "(111, 'Huile d\\'olive', 'Pour l’appliquer, faites chauffer deux cuillères d’huile d’olive. Laissez tiédir et verser 2 à 3 gouttes dans l’oreille.', 'L’huile va lubrifier la peau sèche de l’oreille atteinte et diminuer l’irritation en traitant certaines dermatoses (infections de la peau du conduit auditif externe).', 'https://www.bioalaune.com/fr/actualite-bio/36830/4-reme-naturels-soigner-lotite', 11),\n" +
                "(112, 'Ail', 'Préparez du jus d’ail en mettant des gousses d’ail à cuire. La vapeur va faciliter l’extraction du jus. Faites couler 3 gouttes dans l’oreille douloureuse.', 'Véritable antibiotique naturel, l’ail est redoutable quand il s’agit de combattre les infections. Et pour cause, ses multiples vertus lui permettent de guérir de nombreux maux. Antifongique, antibactérien et antimicrobien, l’ail est le remède idéal pour traiter l’otite', 'https://www.bioalaune.com/fr/actualite-bio/36830/4-reme-naturels-soigner-lotite', 11),\n" +
                "(113, 'Huile essentielle de thym thujanol\\r\\nHuile d\\'Ylang Ylang\\r\\nHuile de ricin', 'Masser avec un mélange d\\'huile qui permettra d\\'en prendre de votre cuir chevelu : 1 goutte d\\'huile essentielle de thym thujanol, 1 goutte d\\'huile essentielle d\\'Ylang Ylang, le tout mélanger à de l\\'huile d\\'olive. Ce massage pourra être pratiqué une à deux fois par semaine.', 'Utiliser des huiles essentielles sera toujours bénéfique pour avoir un cuir chevelu purifié, une circulation sanguine bien activée des cheveux sains et du volume.', 'https://www.femmeactuelle.fr/sante/medecine-douce/solutions-naturelles-chute-cheveux-48519', 12),\n" +
                "(114, 'Oméga 3 (noix, huile de colza, graine de lin, graine de chia, poisson gras...)', 'Consommer ces aliments avec des recettes saines.', 'Les oméga 3 sont de bons remèdes pour fortifier les cheveux', 'https://www.femmeactuelle.fr/sante/medecine-douce/solutions-naturelles-chute-cheveux-48519', 12),\n" +
                "(115, 'Eau citronnée', 'Préparez votre eau citronnée : diluez 1 c. à s. de jus de citron dans un litre d’eau à siroter dans la journée.', 'Cette solution neutralise l’acide gastrique et aide à soulager les gaz et les ballonnements', 'https://www.femmeactuelle.fr/sante/sante-pratique/ballonnements-medecines-douces-29211', 20),\n" +
                "(116, 'Gel d\\'Aloe Vera', 'Appliquez directement le gel sur le coup de soleil en massant. Si la douleur est trop forte, laissez reposer une fine couche. Répétez le soin 3 fois par jour jusqu’à la disparition des rougeurs.', 'Hydratant naturel, adoucissant et anti-inflammatoire, il accélère la cicatrisation et soulage rapidement. ', 'http://www.medecine-douce.net/10-solutions-pour-calmer-coup-soleil/', 16),"+
                "(117, 'Concombre', 'Coupez-le en fines rondelles et dispersez-les sur la zone inflammée. Patientez quelques minutes. La peau réhydratée par la fraîcheur du concombre, sera rapidement soulagée.\\r\\n', 'Naturellement riche en eau, le concombre est un soin idéal contre le coup de soleil', 'http://www.medecine-douce.net/10-solutions-pour-calmer-coup-soleil/', 16),\n" +
                "(118, 'Huile essentielle cyprès\\r\\nHuile essentielle cèdres\\r\\nHuile essentielle cannelle\\r\\nHuile essentielle eucalyptus\\r\\nHuile de noisettes\\r\\n', 'Le massage régulier associé aux huiles essentielles :\\r\\n-HE : cyprès :2 gouttes\\r\\n-HE : cèdres :3 gouttes\\r\\n-HE :canelle : 1 goutte\\r\\n-HE :eucalyptus citronné :5 gouttes\\r\\n-HE : huile de noisette :10 gouttes\\r\\n', 'Elles contiennent trois éléments actifs : des substances désinfiltrantes et veinotoniques pour améliorer la circulation sanguine, des molécules liporéductrices pour fractionner les graisses dans les cellules, des substances raffermissantes.', 'https://www.soignez-vous.com/maladies/la-cellulite-traitee-par-la-medecine-naturelle', 17),\n" +
                "(119, 'Huile essentielle arbre à thé\\r\\nHuile essentielle Niaouli\\r\\nHuile essentielle Ravintsara', 'Conseil d’utilisation : 1 goutte en application locale, 6 à 8 fois par jour, pendant 48 heures ou plus.  Les peaux sensibles incorporeront un peu d’huile végétale au mélange (de noisette, par exemple).', 'Ces huiles essentielles contiennent des principes actifs qui combattent la propagation des boutons.', 'https://www.nana-turopathe.com/vaincre-lherpes-labial-grace-a-naturopathie/', 18),\n" +
                "(120, 'Huile essentielle Ravintsara\\r\\nHuile essentielle eucalyptus\\r\\nHuile essentielle menthe poivrée', 'Inhaler de 5 à 10 minutes, 2 à 3 fois par jour.', 'La vapeur d’eau chaude dilate les petits vaisseaux et optimise l’action anti-infectieuse et décongestionnante des huiles essentielles, d’où un effet rapide.', 'https://www.santemagazine.fr/sante/maladies/maladies-infectieuses/maladies-virales/rhume/les-conseils-pour-soigner-un-rhume-naturellement-170934', 13),\n" +
                "(121, 'Plantain', ' Il suffit de prendre quelques feuilles et de les froisser dans ses mains pour en faire sortir le suc. On l’applique ensuite sur la peau, comme une compresse. Il faut recommencer environ toutes les quinze minutes, jusqu’au soulagement des symptômes.', 'Toutes les variétés de plantain ont des vertus antihistaminiques et sont fréquemment utilisées en cas d’allergies.Le plantain est connu pour calmer la douleur. Ses feuilles soulagent toutes les piqûres d’insectes, qu’elles proviennent des moustiques, des abeilles, des frelons, des guêpes ou des taons : elles neutralisent l’effet de leur venin.', 'https://www.santemagazine.fr/sante/soins-premiers-secours/piqures-insectes/soulager-une-piqure-de-moustique-avec-4-remedes-naturels-170826#Le-vinaigre,-pour-calmer-un-bouton-de-moustique-qui-gratte', 19),"+
                "(122, 'Vinaigre', 'Pur ou dilué si vous avez la peau sensible. Il suffit de verser quelques gouttes de vinaigre sur une compresse et de l’appliquer directement sur la peau. Pour que l’effet perdure, on garde la compresse en la fixant comme un pansement pendant quelques minutes.', 'Grâce à ses vertus antiseptiques, il est utilisé, comme remède de grand-mère, pour désinfecter les écorchures et aider à la cicatrisation. Appliqué sur une piqûre de moustique, il soulage instantanément la démangeaison.', 'https://www.santemagazine.fr/sante/soins-premiers-secours/piqures-insectes/soulager-une-piqure-de-moustique-avec-4-remedes-naturels-170826#Le-vinaigre,-pour-calmer-un-bouton-de-moustique-qui-gratte', 19),\n" +
                "(123, 'Lierre grimpant', 'En infusion : le dosage est de 30 g/L pour une tasse, recouvrez d\\'eau bouillante, couvrez (pour ne pas laisser s\\'échapper les principes actifs...), et laissez infuser 10 minutes maximum, filtrez. En boire 3 à 5 tasses par jour jusqu’à amélioration des symptômes.', 'En cas de rhume, de bronchite et même de coqueluche, son action permet de dégager les voies respiratoires et apaiser une toux grasse.', 'https://www.femmeactuelle.fr/sante/medecine-douce/toux-medecines-douces-26805', 14),\n" +
                "(124, 'Mauve', 'En infusion : le dosage est de 30 g/L pour une tasse, recouvrez d\\'eau bouillante, couvrez (pour ne pas laisser s\\'échapper les principes actifs...), et laissez infuser 10 minutes maximum, filtrez. En boire 3 à 5 tasses par jour jusqu’à amélioration des symptômes.', 'Propriétés calmantes, adoucissantes et anti-inflammatoires : la mauve apaise les gorges irritées ou enflammées et calme la toux grasse.', 'https://www.femmeactuelle.fr/sante/medecine-douce/toux-medecines-douces-26805', 14),\n" +
                "(125, 'Thym', 'Laisser infuser pendant 10 minutes 20 g de sommités fleuries séchées dans 1 litre d’eau bouillante. L’astuce : ajoutez une cuillère de miel pour adoucir la gorge ou quelques gouttes de citron pressé, un excellent antiseptique. Prendre 3 tasses par jour.\\r\\n« Privilégiez le thym en vrac, il est plus concentré et donc plus efficace que le thym que l’on trouve en sachet prêt à l’emploi »\\r\\n', 'Ses vertus antiseptiques en font un très bon agent assainissant de la sphère ORL et des bronches.', 'https://www.plantes-et-sante.fr/articles/plantes-medicinales/2088-thym-les-proprietes-dun-antiseptique-puissant', 15),"+
                "(126, 'Bouillon-blanc', 'En infusion : le dosage est de 30 g/L pour une tasse, recouvrez d\\'eau bouillante, couvrez (pour ne pas laisser s\\'échapper les principes actifs...), et laissez infuser 10 minutes maximum, filtrez. En boire 3 à 5 tasses par jour jusqu’à amélioration des symptômes.', 'Utilisées, principalement pour calmer les toux et, plus généralement, les inflammations des voies respiratoires, du fait de leurs propriétés expectorantes (dû à la présence de saponosides, qui sont des molécules spécifiques) et adoucissantes (dû à la présence de mucilages).', 'https://www.femmeactuelle.fr/sante/medecine-douce/toux-medecines-douces-26805', 15);"+

                "INSERT INTO `symptomes` (`ID_Symptomes`, `LibelleSymptomes`) VALUES\n" +
                "(11, 'Otite'),\n" +
                "(12, 'Chute_Cheveux'),\n" +
                "(13, 'Écoulement_Nasal'),\n" +
                "(14, 'Toux_Grasse'),\n" +
                "(15, 'Toux_Sèche'),\n" +
                "(16, 'Coup_Soleil'),\n" +
                "(17, 'Cellulite'),\n" +
                "(18, 'Herpès'),\n" +
                "(19, 'Piqûre_Moustique'),\n" +
                "(20, 'Ballonnement');";
    }

    public List<RecettesData> remedes(int id_symptomes) {
        List<RecettesData> recettes = new ArrayList<>();
        // SQL
        String strSql = "select * from remedes where ID_Symptomes =? '" +id_symptomes +"'" ;
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql, null);
        cursor.moveToFirst();
        while( ! cursor.isAfterLast() ){
            RecettesData recette = new RecettesData( cursor.getInt(0 ), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4), cursor.getInt(5));
            recettes.add(recette);
            cursor.moveToNext();
        }
        cursor.close();
        return recettes;


    }
}

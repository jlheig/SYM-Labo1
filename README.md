# SYM-Labo1

# Partie 2

## 2.1

Pour que notre application supporte une nouvelle langue, il suffit de copier le dossier qu'on aimerait traduire on lui rajoutant le suffixe -b+<acronyme de la langue supporté> puis de copier les fichiers nécéssitant une traduction dedans.
Dans notre cas, nous avons créé un nouveau dossier values-b+fr, copié le fichier strings.xml (seul fichier nécéssitant à être traduit) puis traduit en français les textes.
L'Intêret de séparer les textes du layout est de ne pas devoir recréer un layout où seul les textes change. Cela permet de factoriser le code et de le rendre plus léger.

Si une traduction est manquante d'une langue additionnelle, elle est remplacé par la langue par défaut de l'app.
Dans le cas d'une traduction manquante de la langue par défaut, le programme ne compile pas. Il est obligatoire de préciser les textes nécéssaire au layout dans la langue par défaut.

## 2.2

Un inputType cohérent a été mis dans le layout de MainActivity pour chaque 
champ de saisie (email et password).

## 2.3

Un layout horizontal a été créé et adapté afin de satisfaire le mode paysage du téléphone.

# Partie 3

## 3.1

Si un @ n'est pas présent dans l'email, un toast est construit et affiché
à l'utilisateur

## 3.2

# Partie 4

## 4.1

On créé l'activité "ProfileActivity" qui servira de page de profil lorsque l'utilisateur se connecte convenablement.

## 4.2

On ajoute une TextView au layout de l'activité afin d'afficher l'adresse email de l'utilisateur lorsque celui-ci se connecte. Il faut donc ajouter un passage de paramètre lors de la création de l'activité, puis récupérer ce paramètre et remplacer le contenu de la TextView.

## 4.3

On ajoute une ImageView au layout de l'activité afin d'afficher une image de profil lorsque l'utilisateur se connecte. On ajoute ensuite le code fourni afin de télécharger une image de profil pouvant remplacer l'image "placeholder" fournie par l'ImageView de base.

# Partie 5

## 5.1

Une nouvelle activité Register a été créé pour l'ajout de credentials
La méthode AndroidX a été choisi pour transférer les nouveaux credentials
de l'activité.
Avec l'ancienne méthode, L'activité récupérait et traitait les infos d'autres d'activités
avec la seule fonction ``OnActivityResult`` ce qui rend potentiellement plus complexe d'avoir
des traitements différents si les activités ne renvoient pas toutes les mêmes données.
C'est ce que corrige la méthode d'AndroidX permettant d'avoir une fonction de callback
différent par activité au moyen de la fonction ``RegisterForActivityResult``
qui prend une activité et pour cette activité une fonction de traitement des données
renvoyés par cetter dernière.

## 5.2

L'image PNG a du être rajouté dans le dossier _drawable_ du dossier de ressources.
Pour la gestion des images matricielles comme du PNG, Il va les adapter au format
de son container en les étirant si les images sont trop grandes ou les compresser
si elles sont trop petites. Ce la peut résulter en des images dont la qualité va
dépendre de la taille des appareils où elles seront affichés. A l'opposé
une image vectorielle est par définition parfaitement redimensionnable sans perdre sa qualité.
Il n'est par contre pas possible des images vectorielles pour des types d'images 
comme de photos pa exemple

## 5.3

Une classe _Utils_ a été créé et contient une fonction de vérification du format de l'email
ainsi que de l'affichage du toast d'erreur. Ces deux fonctions peuvent donc être utilisé
dans l'activité Main et l'activité Register

## 5.4

Une classe GenericActivity a été créé et ajoute des logs pour chaque étape de vie
d'une activité. Toutes les activités (Main, Register et Profile) héritent donc de celle-ci
pour avoir des logs.

Pour le cycle de vie d'une activité, celui-ci commence avec les 3 étapes de démmarrage _onCreate_, 
_onStart_ et _onResume_. Si une nouvelle activité vient au 1er plan la  place de l'active
cette dernière va exécuter _onPause_ puis _onResume_ lorsqu'elle redeviendra en 1er plan.
_onStop_ est appelé quand l'activité n'est plus visible sur l'écran, à partir de là
il y a 2 possibilités, soit l'utilisateur revient dans l'activité alors celle-ci
exécute _onRestart_ puis les 2 dernières étapes du démmarrage (_onStart_ et _onResume_)
soit l'activié se termine ou est détruit par l'OS et dans ce cas _onDestroy_ est exécuté.

Finalement si l'activité a exécuté _onPause_ ou en _onStop_ et que l'OS a besoin de ressources
l'OS peut tuer l'application et donc l'activité en cours. Une fois que l'utilisateur revient sur l'app
L'activité doit donc repasser les 3 étapes de démmarrage.



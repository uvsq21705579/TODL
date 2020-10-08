# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/).
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants
* Vous déposerez une archive contenant l'ensemble de votre travail sur Moodle.

## Partie en présentiel : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le projet Java `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Répondre ici
	-Si on coche une ou plusieurs cases , des fichiers seront deja 		initialisé comme le README ou le .gitignore ce qui donnera moins de 		commits.
	- Si on coche aucune cases le projet sera vide a l'initalisation.

    Pour la suite, ne cochez aucune de ces cases.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    # Répondre ici
    ``` $ git config --global user.name "uvsq21705579"
    ``` $ git config --global user.email redha.dali@ens.uvsq.fr
	
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    # Répondre ici
    ``` $ git init
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    # Commandes pour valider les changements
    ``` $ git add <Fichier> 
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
	public double num;
	public double den;
	
	public Fraction (double x,double y){ 
	    this.num = x;
	    this.den = y;
	}
	public Fraction (){ //intialisation du numerateur a 0 et le denominateur a 1
	    this.num = 0;
	    this.den = 1;
	}

	public String toString(){ // methode toString 
	    return  this.num + "/" + this.den;
	}
    // Code pour tester toString
    ```
	Fraction f1 = new Fraction(4,2);
	System.out.println(f1.toString());

1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    ``` $ git add <Fichier>
	$ git commit -m "Commentaire"
	$ git remote add origin https://github.com/uvsq21705579/	       SimpleFraction.git
	  $ git push -u origin master
	  $ git push 
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Répondre ici
	Sur le site github :
	  Il existe dans la rubrique "<>Code" un button "add a README" qui 		  permet de crée un README directement 
	
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # Répondre ici
    ``` $ git pull
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    # Copier ici le contenu de `.gitignore`
    ``` #les fichiers a ignorés
	Main.class
	Fraction.class
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # Répondre ici
    ``` rm *.class
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ``` 
	#les fichiers a ignorés
	*.class
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Use the SSH protocol with Bitbucket Cloud](https://confluence.atlassian.com/bitbucket/use-the-ssh-protocol-with-bitbucket-cloud-221449711.html)).
    > Expliquez la procédure de façon synthétique
	Terminal : 
	-Utilisation de la commande ssh-keygen pour cree une identité par 		defaut avec une cle public et une cle prive (id_rsa et 		    		id_rsa.pub)
	-Attribuer une phrase de passe
	-Ajouter la cle au ssh-agent 
	 $ ssh-add ~ / .ssh / id_rsa
	-Sur la forge rubrique dans réglages nous avons une rubrique 
	 "clés SSH et GPG " puis dans la partie  "clés ssh" on a le boutton 		 "Ajouté une clé"
	-Sur le terminal , avec la commande $ cat id_rsa.pub on affiche 	 le contenu du fichier puis on le copie 
	-Sur la forge on nomme la clé et on colle le contenu du fichier dans 		 la partie clé.	

## Partie en distanciel : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, ...).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, ...).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Répondre ici
	OS : linux
	shell : bash
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # Répondre ici
    ```help 
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # Répondre ici
        ``` ls -l
    1. compter le nombre de ligne d'un fichier
        ```bash
        # Répondre ici
        ``` wc -l fichier
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```cat Main.java
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ``` grep -r uneVariable *.java

    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # Répondre ici
        ```find -name README.md 
	```tree -F
    1. afficher les différences entre deux fichiers textes
        ```bash
        # Répondre ici
        ``` diff fichier1.txt fichier2.txt
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Répondre ici
	ssh est un protocole permettant d'établir une communication chiffrée 		entre une machine locale et une machine distante.
    * `screen`/`tmux`
        > Répondre ici
	est un « multiplexeur de terminaux » permettant d'ouvrir plusieurs 		terminaux dans une même console, de passer de l'un à l'autre et de les 		récupérer plus tard.
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
	Curl est un outil qui permet de faire des requêtes à un serveur via un 		des protocoles supportés
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici
	Jq est un programme de type filtre.
	Il accepte une entrée et produit une sortie. Pour produire cette 	 sortie, il y a de nombreux outils et filtres mis à disposition par 	   l’outil, pour extraire/manipuler des données. Par un exemple extraire 		un champ particulier d’un objet Json.



### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), ...).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Répondre ici
	Intellij
    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
	"File" puis "File properties" puis "File encoding" puis definir l'encodage *UTF-8*
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
	On choisie le JDK en allant dans "File" puis "Project structure" puis 		"Project Settings" et enfin "Projet SDK"
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
	Pour preciser la version Java source il faudrai allée dans les 		memes parametres que pour choisir le JDK et selectionné la version 		souhaitée 
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
	en utilisant import java.
	ou bien en allant dans "File > Project Structure > Platform Settings 		> Global librairie" puis appuyer sur le "+" pour ajouté une librairie 
1. Comment reformater un fichier source Java ?
    > Répondre ici
	clique droit puis le boutton Refactor
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
	en laissant le curseur de la souris sur la variable 
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
	Selectionné la partie du code souhaité puis faire un clique droit puis
	le boutton "Generate"
1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
	clique droit puis "Refector" puis "Rename"
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
	en utilisant les deux commande :
	$ javac *.java
	$ java Main
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
	"run" puis "Debug"
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici

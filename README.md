# LogiL2 - Simulateur de Circuits Logiques

Un simulateur de circuits logiques simplifié inspiré de [Logisim](http://www.cburch.com/logisim/), développé en Java avec une interface graphique Swing.

## Description

Ce projet permet de :
- Créer des circuits logiques avec des portes AND, OR, etc.
- Connecter les composants avec des fils
- Simuler le comportement du circuit
- Sauvegarder et charger des circuits

## Structure du projet

```
LogiL2/
├── Main.java                 # Point d'entrée de l'application
├── Circuit.java              # Modèle représentant un circuit
├── Component.java            # Classe de base pour les composants
├── SuperComponent.java       # Composants avancés
├── Wire.java                 # Connexions entre composants
├── CircuitControleur.java    # Contrôleur MVC
├── MainFrame.java            # Fenêtre principale (Vue)
├── ComponenetView.java       # Vue des composants
├── WireView.java             # Vue des fils
├── Simulation.java           # Logique de simulation
├── SimulationRunner.java     # Exécution de la simulation
└── PersistenceManager.java   # Sauvegarde/chargement
```

## Technologies utilisées

- **Langage** : Java
- **Interface graphique** : Swing
- **Architecture** : MVC (Modèle-Vue-Contrôleur)

## Comment exécuter

1. Compiler tous les fichiers Java :
```bash
javac *.java
```

2. Lancer l'application :
```bash
java Main
```

## Fonctionnalités

- Interface graphique interactive
- Ajout de portes logiques (AND, OR)
- Création de connexions entre composants
- Simulation en temps réel
- Persistance des circuits (sauvegarde/chargement)

## Aperçu

L'application s'ouvre avec une fenêtre de 800x600 pixels permettant de visualiser et manipuler les circuits logiques.

## Auteur

Projet réalisé dans le cadre de la Licence 2 Informatique - Sorbonne Paris Nord

## Licence

Projet académique

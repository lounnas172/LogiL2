# LogiL2 - Simulateur de Circuits Logiques

Un simulateur de circuits logiques simplifié inspiré de [Logisim](http://www.cburch.com/logisim/), développé en Java avec une interface graphique Swing.

## Description

Ce projet permet de :
- Créer des circuits logiques avec des portes AND, OR, NOT, XOR, NAND, NOR
- Connecter les composants avec des fils
- Simuler le comportement du circuit en temps réel
- Sauvegarder et charger des circuits

## Structure du projet

```
LogiL2/
├── Main.java              # Point d'entrée de l'application
├── Circuit.java           # Modèle représentant un circuit complet
├── Component.java         # Classe de base pour tous les composants
├── LogicGate.java         # Portes logiques (AND, OR, NOT, XOR, NAND, NOR)
├── SuperComponent.java    # Composants composés
├── Wire.java              # Connexions entre composants
├── CircuitController.java # Contrôleur MVC
├── MainFrame.java         # Fenêtre principale (Vue)
├── ComponentView.java     # Vue des composants
├── WireView.java          # Vue des fils
├── Simulation.java        # Logique de simulation
├── SimulationRunner.java  # Exécution de la simulation
└── PersistenceManager.java# Sauvegarde/chargement des circuits
```

## Technologies utilisées

- **Langage** : Java 8+
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

- **Portes logiques supportées** : AND, OR, NOT, XOR, NAND, NOR
- Interface graphique interactive
- Création de connexions entre composants
- Simulation en temps réel
- Persistance des circuits

## Aperçu

L'application ouvre une fenêtre de 800x600 pixels avec :
- Une zone de travail pour placer les composants
- Un bouton "Simuler" pour exécuter la simulation

## Auteur

Projet réalisé en fin de Licence 2 Informatique - Sorbonne Paris Nord (2024)

## Licence

Projet académique

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.control.GameControl;
import OregonTrail.control.PlayerHealth;
import OregonTrail.model.Player;
import OregonTrail.view.StartProgramView;
import OregonTrail.model.Game;
import OregonTrail.view.GameMenuView;
import OregonTrail.view.ViewInterface;
import OregonTrail.view.View;
import exceptions.OregonTrailException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MasterCraft Computer
 */
public class OregonTrail {
    
    private static Player player = null;
    private static Game currentGame = null;
    
    private static PrintWriter logFile = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static void main(String[] args) throws OregonTrailException {
        
        try {
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();

        } catch (Throwable ote) {
            System.out.println(ote.getMessage());
            ote.printStackTrace();
        }
        
        try {
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OregonTrail.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (inFile != null);
                OregonTrail.inFile.close();
                
                if (outFile != null);
                outFile.close();
                
                if (logFile != null);
                logFile.close();
            } catch (IOException ex) {
                System.console().printf("Error closing files.", args);
                return;
            }
        }
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        OregonTrail.outFile = outfile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader infile) {
        OregonTrail.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }
    
    
}

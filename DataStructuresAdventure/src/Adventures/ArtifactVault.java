package Adventures;
import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;
    private int size;  

    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];
        size = 0;
    }

    public void addArtifact(String artifact) {
        if (size < artifacts.length) {
            artifacts[size] = artifact;
            size++;
        } else {
            System.out.println("Vault is full, cannot add more artifacts.");
        }
    }

    public void removeArtifact(String artifactName) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(artifactName)) {
                for (int j = i; j < size - 1; j++) {
                    artifacts[j] = artifacts[j + 1];
                }
                artifacts[size - 1] = null; 
                size--; 
                return;
            }
        }
        System.out.println("Artifact not found.");
    }


    public int linearSearch(String artifactName) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(artifactName)) {
                return i; 
            }
        }
        return -1; 
    }

    public int binarySearch(String artifactName) {
        return Arrays.binarySearch(artifacts, 0, size, artifactName);
    }

    public void displayVault() {
        System.out.print("Artifacts in Vault: ");
        for (int i = 0; i < size; i++) {
            System.out.print(artifacts[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArtifactVault vault = new ArtifactVault(5);
        
        vault.addArtifact("Golden Idol");
        vault.addArtifact("Crystal Skull");
        vault.addArtifact("Holy Grail");
        vault.displayVault();
        vault.removeArtifact("Crystal Skull");
        vault.displayVault();

        int idx = vault.linearSearch("Golden Idol");
        if (idx != -1) {
            System.out.println("Golden Idol found at index: " + idx);
        } else {
            System.out.println("Golden Idol not found.");
        }

        vault.addArtifact("Spear of Destiny");
        vault.addArtifact("Ark of the Covenant");

        Arrays.sort(vault.artifacts, 0, vault.size);

        idx = vault.binarySearch("Holy Grail");
        if (idx >= 0) {
            System.out.println("Holy Grail found at index: " + idx);
        } else {
            System.out.println("Holy Grail not found.");
        }
        vault.displayVault();
    }
}

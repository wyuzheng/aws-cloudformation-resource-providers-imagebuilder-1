package software.amazon.imagebuilder.infrastructureconfiguration;


import software.amazon.awssdk.services.imagebuilder.ImagebuilderClient;

class ClientBuilder {
    static ImagebuilderClient getImageBuilderClient() {
        return ImagebuilderClient.create();
    }
}
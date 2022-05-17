public class Resource {
  private String fileName, extension;

  public Resource(String fileName, String extension) {
    this.fileName = fileName;
    this.extension = extension;
  }

  public String getFileName()
  {
    return fileName;
  }

  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }

  public boolean isPDF() {
    return extension.equalsIgnoreCase("PDF");
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Resource))
      return false;
    else {
      Resource other = (Resource) obj;
      return other.fileName.equals(fileName) && other.extension.equals(extension);
    }
  }

  @Override
  public String toString() {
    return "fileName='" + fileName + '\'' +
        ", extension='" + extension + '\'' ;
  }
}

package models;

public class CatalogItem {
  private String name;
  private short releaseYear;
  private String synopsis;

  public CatalogItem(String name, short releaseYear) {
    this.name = name;
    this.releaseYear = releaseYear;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public short getReleaseYear() { return releaseYear; }
  public void setReleaseYear(short releaseYear) { this.releaseYear = releaseYear; }

  public String getSynopsis() { return synopsis; }
  public void setSynopsis(String synopsis) { this.synopsis = synopsis; }

  @Override
  public String toString() {
    return "Nome: " + name + ", ano de lançamento: " + releaseYear;
  }
}
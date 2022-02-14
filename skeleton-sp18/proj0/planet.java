public class Planet {
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;
  private static final double G = 6.67e-11;

  public Planet(double xP, double yP, double xV,
      double yV, double m, String img) {
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }

  public Planet(Planet p) {
    xxPos = p.xxPos;
    yyPos = p.yyPos;
    xxVel = p.xxVel;
    yyVel = p.yyVel;
    mass = p.mass;
    imgFileName = p.imgFileName;
  }

  public double calcDistance(Planet p) {
    return Math.sqrt(Math.pow((xxPos - p.xxPos), 2) + Math.pow((yyPos - p.yyPos), 2));
  }

  public double calcForceExertedBy(Planet p) {
    return G * p.mass * mass / Math.pow(calcDistance(p), 2);
  }

  public double calcForceExertedByX(Planet p) {
    return calcForceExertedBy(p) * (p.xxPos - xxPos) / calcDistance(p);
  }

  public double calcForceExertedByY(Planet p) {
    return calcForceExertedBy(p) * (p.yyPos - yyPos) / calcDistance(p);
  }

  public double calcNetForceExertedByX(Planet[] allPlanets) {
    double totalForce = 0;
    for (Planet planet : allPlanets) {
      if (this.equals(planet)) {
        continue;
      }
      totalForce += calcForceExertedByX(planet);
    }
    return totalForce;
  }

  public double calcNetForceExertedByY(Planet[] allPlanets) {
    double totalForce = 0;
    for (Planet planet : allPlanets) {
      if (this.equals(planet)) {
        continue;
      }
      totalForce += calcForceExertedByY(planet);
    }
    return totalForce;
  }

  public void update(double dt,double fX,double fY){
		double ax = fX / mass;
		double ay = fY / mass;
		xxVel += dt * ax;
		yyVel += dt * ay;
		xxPos += xxVel * dt;
		yyPos += yyVel * dt;
	}
}
public class Planet{
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	String imgFileName;
	
	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		
		xxPos=xP;
		yyPos=yP;
		xxVel=xV;
		yyVel=yV;
		mass=m;
		imgFileName=img;
		
	}
	
	public Planet(Planet p){
		xxPos=p.xxPos;
		yyPos=p.yyPos;
		xxVel=p.xxVel;
		yyVel=p.yyVel;
		mass=p.mass;
		imgFileName=p.imgFileName;
	}
	
	
	public double calcDistance(Planet p){
		double dx=p.xxPos-xxPos;
		double dy=p.yyPos-yyPos;
		
		return Math.sqrt(dx*dx+dy*dy); 
	}
}
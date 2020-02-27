// A Point object represents a pair of (x, y) coordinates.// Final version with encapsulation and multiple constructorspublic class jas_Point{  // fields   private int x;   // encapsulated values (private)   private int y;      // constructs a new point at the origin   public jas_Point()   {      this.x = 0;      this.y = 0;   }      // constructors a new point with the given (x, y) location   public jas_Point(int x, int y)   {      this.x = x;      this.y = y;   }     // sets the point's location to this x, y value   public void setLocation(int X, int Y)   {      x = X;      y = Y;   }      // translates the point's location by some dx, dy   public void translate(int dx, int dy)   {       x += dx;       y += dy;   }      // returns the x-coordinate of the point   public int getX()   {      return x;   }      // returns the y-coordinate of the point   public int getY()   {      return y;   }   // returns the distance between this point and (0, 0)   public double distanceFromOrigin()   {      return Math.sqrt(Math.pow(this.x - 0,2)+Math.pow(this.y - 0,2));   }         //p.579, Self-Check #10   //returns the distance between the two points   public double distance(jas_Point other)   {      return Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y,2));   }            // p. 580, Exercise #1   // returns the quadrant the point falls in.   public int quadrant()   {      if (x == 0 && y == 0)         return 0;      else if (x >= 0 && y >= 0)         return 1;      else if (x <= 0 && y >= 0)         return 2;      else if (x <= 0 && y <= 0)         return 3;      else if (x >= 0 && y <= 0)         return 4;      return 0;   }      // p. 581, #2   // negates and flips the x & y coordinates of the point   // but do not negate 0   public void flip()   {   int x1 = this.x;             // holds old values of x and y   int y1 = this.y;         if (x == 0)       //if x is equal to 0      {         x1 = -y1;      //make original value of x equal to negated original value of y         this.y = this.x;         //make new value of y equal to x (0)         this.x = x1;        // make new value of x equal to negated original value of y      }      else if (this.y == 0)      {         y1 = -x1;         //make orignal y value equal to negated x          this.x = this.y;            // make new x equal to y (0)         this.y = y1;           // make new y equal to negated x      }      else       {         this.x = -y1;          //make new x equal to old negated y         this.y = -x1;          //make new y equal to old negated x      }   }      // p. 581, #3   // calculates the manhattan distance between two points   public int manhattanDistance(jas_Point other)   {      return ((int) Math.abs(this.x - other.x) + Math.abs(this.y-other.y));   }      //p. 581, #4   // determine if two points line up vertically   public boolean isVertical(jas_Point other)   {      if (this.x == other.x)         return true;      return false;   }      // p. 581, #5   // calculate the slope between two points   public double slope(jas_Point other)         //y = mx+b   {      int m = (other.y - this.y)/(other.x - this.x);      return m;   }         // p. 581, #6   // determine if three points are collinear   public boolean isCollinear(jas_Point p2, jas_Point p3)   {         //test if the points have equal x-values      //this would result in an undefined slope      //so throw an Illegal Argument Exception      // ** your code here **      if (this.x == p2.x)         if (p2.x == p3.x)         throw new IllegalArgumentException("Undefined Slope");               //calculate the slope between two points (all combinations)      //         // ** your code here **      int p1p2m = (p2.y - this.y)/(p2.x - this.x);      int p2p3m = (p3.y - p2.y)/(p3.x - p2.x);      int p1p3m = (p3.y - this.y)/(p3.x - this.x);            if (p1p2m == p2p3m && p2p3m == p1p2m)         return true;      return false;                        }            // returns a String representation of this point   // do not include print or println statements here   // return the string that they would print   public String toString()   {      return this.x + ", " + this.y;   }   }
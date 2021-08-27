package p8;

import java.util.ArrayList;

public class MRun {
	public void run() {
		
		ArrayList<LandMovable> movable = new ArrayList<LandMovable>();
		
		movable.add(new Hawk());
		movable.add(new LandMovable() {	
			@Override
			public void landMove() {
				System.out.println("고양이가 네발로 움직임");
			}
		}
		);
		movable.add(new LandMovable() {	
			@Override
			public void landMove() {
				System.out.println("뱀이 기어서 움직임");
			}
		}
		);
		movable.add(new LandMovable() {	
			@Override
			public void landMove() {
				System.out.println("사람이 두발로 움직임");
			}
		}
		);
		movable.add(new LandMovable() {	
			@Override
			public void landMove() {
				System.out.println("개가 네발로 움직임");
			}
		}
		);
		for(int i = 0; i < movable.size(); i++) {
			movable.get(i).landMove();
		};
		
//		for(int i = 0; i < movable.size(); i++){
//			if(movable.get(i) instanceof Hawk) {
//				try {
//					((Hawk) movable.get(i)).fly();
//				} catch (ClassCastException e) {
//				  }
//			}
//		}
	}
}

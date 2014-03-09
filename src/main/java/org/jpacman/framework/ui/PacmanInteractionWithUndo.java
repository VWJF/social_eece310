package main.java.org.jpacman.framework.ui;

import java.util.Observable;

import main.java.org.jpacman.framework.model.IGameInteractorWithUndo;

import org.jpacman.framework.controller.IController;
import org.jpacman.framework.ui.PacmanInteraction;

public class PacmanInteractionWithUndo extends PacmanInteraction
        implements IPacmanInteractionWithUndo {

	private IGameInteractorWithUndo gameInteractorUndo;

	@Override
	public void up() {
		super.up();
	}

	@Override
	public void down() {
		super.down();
	}

	@Override
	public void left() {
		super.left();
	}

	@Override
	public void right() {
		super.right();
	}

	@Override
	public void start() {
		super.start();
	}

	@Override
	public void stop() {
		super.stop();
	}

	@Override
	public void exit() {
		super.exit();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		updateState();
	}

	@Override
	public void undo() {
		// TODO Temporary Action
		// super.stop();
		System.out.println("####Error: Retriveing Food.");
		if (getCurrentState() == MatchState.PLAYING) {
			((IGameInteractorWithUndo) this.getGame()).undo();
			// getGame().undo();
			updateState();
		}

		// super.updateState();
		// TODO: additional updates as needed here
	}

	/**
	 * Add an external controller, which should be stopped/started via the ui.
	 * 
	 * @param controller
	 *            The controller to be added.
	 * @return Itself, for fluency.
	 */
	@Override
	public PacmanInteractionWithUndo controlling(IController controller) {
		super.controlling(controller);
		return this;
	}

	/*
	 * PacmanInteractionWithUndo(){ super.withGameInteractor(new IGameInteractorWithUndo); }
	 */
}

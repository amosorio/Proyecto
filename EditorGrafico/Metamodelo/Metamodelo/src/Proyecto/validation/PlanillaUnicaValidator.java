/**
 *
 * $Id$
 */
package Proyecto.validation;

import Proyecto.TipoPagadorPension;
import Proyecto.TipoPension;
import Proyecto.TipoPensionado;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Proyecto.PlanillaUnica}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PlanillaUnicaValidator {
	boolean validate();

	boolean validateTiposPensionado(EList<TipoPensionado> value);

	boolean validateTiposPagadorPension(EList<TipoPagadorPension> value);

	boolean validateTiposPension(EList<TipoPension> value);

	boolean validateTipospensionado(EList value);
	boolean validateTipospagadorpension(EList value);
	boolean validateTipospension(EList value);
}
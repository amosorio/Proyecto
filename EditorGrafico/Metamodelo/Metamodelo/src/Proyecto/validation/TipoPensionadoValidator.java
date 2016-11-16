/**
 *
 * $Id$
 */
package Proyecto.validation;

import Proyecto.TipoPagadorPension;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Proyecto.TipoPensionado}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TipoPensionadoValidator {
	boolean validate();

	boolean validateCodigo(int value);
	boolean validateNombre(String value);
	boolean validateTiposPagadorPension(EList<TipoPagadorPension> value);

	boolean validateTipospagadorpension(EList value);
	boolean validateTipospension(EList value);
	boolean validateDescripcion(String value);
}
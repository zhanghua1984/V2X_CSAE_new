/*
 * Generated by ASN.1 C++ Compiler (http://www.asnlab.org/)
 * From ASN.1 module "SPAT"
 */
#include "SPAT.h"
#include "SPAT.h"

namespace spat {

SPAT::SPAT() {
}

void SPAT::free() {
	free_object(this, SPAT::TYPE, &SPAT::CONVERTER);
}

AsnType* SPAT::TYPE = SPAT::getType(65537);
ASN_COMPOSITE(
	CompositeConverter,
	SPAT,
	{ 0 }
);

}

package asm.org.eclipse.persistence.jaxb.compiler.facets;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class FacetVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jaxb/compiler/facets/FacetVisitor", "<R:Ljava/lang/Object;P:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DecimalMinFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DecimalMinFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DecimalMaxFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DecimalMaxFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DigitsFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/DigitsFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/MaxFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/MaxFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/MinFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/MinFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/PatternFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/PatternFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/PatternListFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/PatternListFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(Lorg/eclipse/persistence/jaxb/compiler/facets/SizeFacet;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jaxb/compiler/facets/SizeFacet;TP;)TR;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

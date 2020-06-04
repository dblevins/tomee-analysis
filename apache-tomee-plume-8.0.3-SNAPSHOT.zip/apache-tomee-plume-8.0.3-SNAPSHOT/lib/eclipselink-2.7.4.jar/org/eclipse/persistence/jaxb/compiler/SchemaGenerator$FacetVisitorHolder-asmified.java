package asm.org.eclipse.persistence.jaxb.compiler;
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
public class SchemaGenerator$FacetVisitorHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder", "org/eclipse/persistence/jaxb/compiler/SchemaGenerator", "FacetVisitorHolder", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VISITOR", "Lorg/eclipse/persistence/jaxb/compiler/facets/FacetVisitor;", "Lorg/eclipse/persistence/jaxb/compiler/facets/FacetVisitor<Ljava/lang/Void;Lorg/eclipse/persistence/internal/oxm/schema/model/Restriction;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder", "VISITOR", "Lorg/eclipse/persistence/jaxb/compiler/facets/FacetVisitor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$0", "()Lorg/eclipse/persistence/jaxb/compiler/facets/FacetVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$FacetVisitorHolder", "VISITOR", "Lorg/eclipse/persistence/jaxb/compiler/facets/FacetVisitor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

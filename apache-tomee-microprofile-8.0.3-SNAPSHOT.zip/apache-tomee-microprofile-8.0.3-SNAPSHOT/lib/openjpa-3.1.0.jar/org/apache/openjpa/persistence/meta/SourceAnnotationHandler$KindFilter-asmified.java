package asm.org.apache.openjpa.persistence.meta;
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
public class SourceAnnotationHandler$KindFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$KindFilter", "Ljava/lang/Object;Lorg/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter<Ljavax/lang/model/element/Element;>;", "java/lang/Object", new String[] { "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$KindFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "KindFilter", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "InclusiveFilter", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "target", "Ljavax/lang/model/element/ElementKind;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/lang/model/element/ElementKind;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$KindFilter", "target", "Ljavax/lang/model/element/ElementKind;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "includes", "(Ljavax/lang/model/element/Element;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/lang/model/element/Element", "getKind", "()Ljavax/lang/model/element/ElementKind;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$KindFilter", "target", "Ljavax/lang/model/element/ElementKind;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

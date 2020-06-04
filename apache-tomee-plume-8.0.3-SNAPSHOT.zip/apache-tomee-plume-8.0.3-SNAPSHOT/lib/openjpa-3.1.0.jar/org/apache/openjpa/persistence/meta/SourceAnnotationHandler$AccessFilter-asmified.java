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
public class SourceAnnotationHandler$AccessFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AccessFilter", "Ljava/lang/Object;Lorg/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter<Ljavax/lang/model/element/Element;>;", "java/lang/Object", new String[] { "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AccessFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "AccessFilter", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "InclusiveFilter", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "target", "Ljavax/persistence/AccessType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/persistence/AccessType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AccessFilter", "target", "Ljavax/persistence/AccessType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "includes", "(Ljavax/lang/model/element/Element;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/persistence/Access;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "getAnnotationValue", "(Ljavax/lang/model/element/Element;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AccessFilter", "target", "Ljavax/persistence/AccessType;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "equalsByValue", "(Ljava/lang/Enum;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

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
public class SourceAnnotationHandler$AnnotatedFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AnnotatedFilter", "Ljava/lang/Object;Lorg/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter<Ljavax/lang/model/element/Element;>;", "java/lang/Object", new String[] { "org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$AnnotatedFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "AnnotatedFilter", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/SourceAnnotationHandler$InclusiveFilter", "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "InclusiveFilter", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "includes", "(Ljavax/lang/model/element/Element;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/meta/SourceAnnotationHandler", "isAnnotated", "(Ljavax/lang/model/element/Element;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

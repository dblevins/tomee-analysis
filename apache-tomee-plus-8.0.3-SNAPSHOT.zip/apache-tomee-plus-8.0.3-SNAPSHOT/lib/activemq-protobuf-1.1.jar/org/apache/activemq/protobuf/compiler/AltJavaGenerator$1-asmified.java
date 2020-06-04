package asm.org.apache.activemq.protobuf.compiler;
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
public class AltJavaGenerator$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/activemq/protobuf/compiler/AltJavaGenerator$1", null, "java/lang/Object", new String[] { "org/apache/activemq/protobuf/compiler/AltJavaGenerator$Closure" });

classWriter.visitOuterClass("org/apache/activemq/protobuf/compiler/AltJavaGenerator", "compile", "(Ljava/io/File;)V");

classWriter.visitInnerClass("org/apache/activemq/protobuf/compiler/AltJavaGenerator$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/protobuf/compiler/AltJavaGenerator$Closure", "org/apache/activemq/protobuf/compiler/AltJavaGenerator", "Closure", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/protobuf/compiler/AltJavaGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/protobuf/compiler/AltJavaGenerator;)V", null, new String[] { "org/apache/activemq/protobuf/compiler/CompilerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/protobuf/compiler/AltJavaGenerator$1", "this$0", "Lorg/apache/activemq/protobuf/compiler/AltJavaGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "()V", null, new String[] { "org/apache/activemq/protobuf/compiler/CompilerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/protobuf/compiler/AltJavaGenerator$1", "this$0", "Lorg/apache/activemq/protobuf/compiler/AltJavaGenerator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/compiler/AltJavaGenerator", "access$000", "(Lorg/apache/activemq/protobuf/compiler/AltJavaGenerator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

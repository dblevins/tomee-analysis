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
public class JavaGenerator$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", null, "java/lang/Object", new String[] { "org/apache/activemq/protobuf/compiler/JavaGenerator$Closure" });

classWriter.visitOuterClass("org/apache/activemq/protobuf/compiler/JavaGenerator", "generateProtoFile", "()V");

classWriter.visitInnerClass("org/apache/activemq/protobuf/compiler/JavaGenerator$3", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/protobuf/compiler/JavaGenerator$Closure", "org/apache/activemq/protobuf/compiler/JavaGenerator", "Closure", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$o", "Lorg/apache/activemq/protobuf/compiler/MessageDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/protobuf/compiler/JavaGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/protobuf/compiler/JavaGenerator;Lorg/apache/activemq/protobuf/compiler/MessageDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", "this$0", "Lorg/apache/activemq/protobuf/compiler/JavaGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", "val$o", "Lorg/apache/activemq/protobuf/compiler/MessageDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "()V", null, new String[] { "org/apache/activemq/protobuf/compiler/CompilerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", "this$0", "Lorg/apache/activemq/protobuf/compiler/JavaGenerator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/compiler/JavaGenerator", "access$100", "(Lorg/apache/activemq/protobuf/compiler/JavaGenerator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", "this$0", "Lorg/apache/activemq/protobuf/compiler/JavaGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/protobuf/compiler/JavaGenerator$3", "val$o", "Lorg/apache/activemq/protobuf/compiler/MessageDescriptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/compiler/JavaGenerator", "access$300", "(Lorg/apache/activemq/protobuf/compiler/JavaGenerator;Lorg/apache/activemq/protobuf/compiler/MessageDescriptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

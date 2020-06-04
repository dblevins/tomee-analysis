package asm.org.apache.openejb.client;
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
public class MulticastPulseClient$5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/client/MulticastPulseClient$5", null, "org/apache/openejb/client/CommandParser", null);

classWriter.visitOuterClass("org/apache/openejb/client/MulticastPulseClient", null, null);

classWriter.visitInnerClass("org/apache/openejb/client/MulticastPulseClient$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/CommandParser$Arguments", "org/apache/openejb/client/CommandParser", "Arguments", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/CommandParser$Option", "org/apache/openejb/client/CommandParser", "Option", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Options");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastPulseClient$5", "category", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitLdcInsn("group");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastPulseClient$5", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Group name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn("host");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastPulseClient$5", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("239.255.3.2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Multicast address");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitLdcInsn("port");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastPulseClient$5", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitIntInsn(SIPUSH, 6142);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Multicast port");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitLdcInsn("timeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastPulseClient$5", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Pulse back timeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "validate", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List;", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "validate", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "usage", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "usage", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

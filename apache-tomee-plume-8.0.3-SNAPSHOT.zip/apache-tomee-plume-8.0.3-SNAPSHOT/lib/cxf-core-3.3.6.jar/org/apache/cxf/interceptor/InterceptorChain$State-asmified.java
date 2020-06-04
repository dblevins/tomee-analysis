package asm.org.apache.cxf.interceptor;
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
public class InterceptorChain$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/interceptor/InterceptorChain$State", "Ljava/lang/Enum<Lorg/apache/cxf/interceptor/InterceptorChain$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/interceptor/InterceptorChain$State", "org/apache/cxf/interceptor/InterceptorChain", "State", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAUSED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXECUTING", "Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPLETE", "Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABORTED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "$VALUES", "[Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/interceptor/InterceptorChain$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/interceptor/InterceptorChain$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/interceptor/InterceptorChain$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAUSED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InterceptorChain$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "PAUSED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InterceptorChain$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "SUSPENDED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXECUTING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InterceptorChain$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "EXECUTING", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPLETE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InterceptorChain$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "COMPLETE", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABORTED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InterceptorChain$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "ABORTED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/interceptor/InterceptorChain$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "PAUSED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "SUSPENDED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "EXECUTING", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "COMPLETE", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "ABORTED", "Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/interceptor/InterceptorChain$State", "$VALUES", "[Lorg/apache/cxf/interceptor/InterceptorChain$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

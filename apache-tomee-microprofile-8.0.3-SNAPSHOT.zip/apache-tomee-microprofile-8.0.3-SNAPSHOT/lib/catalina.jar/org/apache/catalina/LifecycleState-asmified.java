package asm.org.apache.catalina;
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
public class LifecycleStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/LifecycleState", "Ljava/lang/Enum<Lorg/apache/catalina/LifecycleState;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEW", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITIALIZING", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITIALIZED", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTING_PREP", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTING", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTED", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPING_PREP", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPING", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPED", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DESTROYING", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DESTROYED", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED", "Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "available", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lifecycleEvent", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/LifecycleState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "$VALUES", "[Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/LifecycleState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/LifecycleState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/LifecycleState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "(ZLjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/LifecycleState", "available", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/LifecycleState", "lifecycleEvent", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/LifecycleState", "available", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLifecycleEvent", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/LifecycleState", "lifecycleEvent", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEW");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "NEW", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITIALIZING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("before_init");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "INITIALIZING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITIALIZED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("after_init");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "INITIALIZED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTING_PREP");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("before_start");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STARTING_PREP", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTING");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("start");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STARTING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("after_start");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STARTED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPING_PREP");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("before_stop");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STOPPING_PREP", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPING");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("stop");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STOPPING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPED");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("after_stop");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "STOPPED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DESTROYING");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("before_destroy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "DESTROYING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DESTROYED");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("after_destroy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "DESTROYED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleState", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "FAILED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "NEW", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "INITIALIZING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "INITIALIZED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STARTING_PREP", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STARTING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STARTED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STOPPING_PREP", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STOPPING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STOPPED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "DESTROYING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "DESTROYED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "FAILED", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/LifecycleState", "$VALUES", "[Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

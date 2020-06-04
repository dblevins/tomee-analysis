package asm.org.apache.webbeans.container;
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
public class BeanManagerImpl$LifecycleStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "Ljava/lang/Enum<Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "org/apache/webbeans/container/BeanManagerImpl", "LifecycleState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEFORE_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "$VALUES", "[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEFORE_DISCOVERY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "BEFORE_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISCOVERY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_DISCOVERY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "AFTER_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "BEFORE_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "AFTER_DISCOVERY", "Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/container/BeanManagerImpl$LifecycleState", "$VALUES", "[Lorg/apache/webbeans/container/BeanManagerImpl$LifecycleState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

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
public class BeanCacheKey$LazyAnnotatedTypesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "org/apache/webbeans/container/BeanCacheKey", "LazyAnnotatedTypes", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/container/BeanCacheKey$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "qualifierAt", "Ljavax/enterprise/inject/spi/AnnotatedType;", "Ljavax/enterprise/inject/spi/AnnotatedType<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "qualifierAts", "[Ljavax/enterprise/inject/spi/AnnotatedType;", "[Ljavax/enterprise/inject/spi/AnnotatedType<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;[Ljavax/enterprise/inject/spi/AnnotatedType;)V", "(Ljavax/enterprise/inject/spi/AnnotatedType<*>;[Ljavax/enterprise/inject/spi/AnnotatedType<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "qualifierAt", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "qualifierAts", "[Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes;)Ljavax/enterprise/inject/spi/AnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "qualifierAt", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;[Ljavax/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/container/BeanCacheKey$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;[Ljavax/enterprise/inject/spi/AnnotatedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes;)[Ljavax/enterprise/inject/spi/AnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/BeanCacheKey$LazyAnnotatedTypes", "qualifierAts", "[Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

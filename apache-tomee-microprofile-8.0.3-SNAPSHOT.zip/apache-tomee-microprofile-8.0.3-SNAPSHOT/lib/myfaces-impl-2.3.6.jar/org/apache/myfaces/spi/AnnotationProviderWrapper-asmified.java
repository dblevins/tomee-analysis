package asm.org.apache.myfaces.spi;
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
public class AnnotationProviderWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/spi/AnnotationProviderWrapper", "Lorg/apache/myfaces/spi/AnnotationProvider;Ljavax/faces/FacesWrapper<Lorg/apache/myfaces/spi/AnnotationProvider;>;", "org/apache/myfaces/spi/AnnotationProvider", new String[] { "javax/faces/FacesWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "delegate", "Lorg/apache/myfaces/spi/AnnotationProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/AnnotationProvider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/spi/AnnotationProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/AnnotationProvider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/spi/AnnotationProviderWrapper", "delegate", "Lorg/apache/myfaces/spi/AnnotationProvider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedClasses", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Map;", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Map<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljava/util/Set<Ljava/lang/Class<*>;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProviderWrapper", "getWrapped", "()Lorg/apache/myfaces/spi/AnnotationProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProvider", "getAnnotatedClasses", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseUrls", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/net/URL;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProviderWrapper", "getWrapped", "()Lorg/apache/myfaces/spi/AnnotationProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProvider", "getBaseUrls", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseUrls", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Set;", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Set<Ljava/net/URL;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProviderWrapper", "getWrapped", "()Lorg/apache/myfaces/spi/AnnotationProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProvider", "getBaseUrls", "(Ljavax/faces/context/ExternalContext;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Lorg/apache/myfaces/spi/AnnotationProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/AnnotationProviderWrapper", "delegate", "Lorg/apache/myfaces/spi/AnnotationProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/AnnotationProviderWrapper", "getWrapped", "()Lorg/apache/myfaces/spi/AnnotationProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

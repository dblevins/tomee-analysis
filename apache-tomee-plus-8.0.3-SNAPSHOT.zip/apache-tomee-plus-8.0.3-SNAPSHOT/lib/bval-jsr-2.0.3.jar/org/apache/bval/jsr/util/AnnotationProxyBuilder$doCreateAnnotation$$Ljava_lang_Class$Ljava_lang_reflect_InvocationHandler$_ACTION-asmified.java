package asm.org.apache.bval.jsr.util;
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
public class AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTIONDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_SYNTHETIC, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "Ljava/security/PrivilegedAction<Ljava/lang/annotation/Annotation;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f1", "Lorg/apache/bval/jsr/util/AnnotationProxyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f2", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f3", "Ljava/lang/reflect/InvocationHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/util/AnnotationProxyBuilder;Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f1", "Lorg/apache/bval/jsr/util/AnnotationProxyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f2", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f3", "Ljava/lang/reflect/InvocationHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f1", "Lorg/apache/bval/jsr/util/AnnotationProxyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f2", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/AnnotationProxyBuilder$doCreateAnnotation$$Ljava_lang_Class$Ljava_lang_reflect_InvocationHandler$_ACTION", "f3", "Ljava/lang/reflect/InvocationHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/AnnotationProxyBuilder", "__privileged_access$2", "(Lorg/apache/bval/jsr/util/AnnotationProxyBuilder;Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

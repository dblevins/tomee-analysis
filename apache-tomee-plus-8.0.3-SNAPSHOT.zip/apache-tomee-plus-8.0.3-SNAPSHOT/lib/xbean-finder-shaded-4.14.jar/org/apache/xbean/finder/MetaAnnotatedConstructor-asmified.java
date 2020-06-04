package asm.org.apache.xbean.finder;
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
public class MetaAnnotatedConstructorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/finder/MetaAnnotatedConstructor", "<T:Ljava/lang/Object;>Lorg/apache/xbean/finder/MetaAnnotatedElement<Ljava/lang/reflect/Constructor<TT;>;>;Lorg/apache/xbean/finder/AnnotatedMethod<Ljava/lang/reflect/Constructor<TT;>;>;", "org/apache/xbean/finder/MetaAnnotatedElement", new String[] { "org/apache/xbean/finder/AnnotatedMethod" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterAnnotations", "[[Ljava/lang/annotation/Annotation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/reflect/Constructor;)V", "(Ljava/lang/reflect/Constructor<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/MetaAnnotatedConstructor", "unroll", "(Ljava/lang/reflect/AnnotatedElement;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/MetaAnnotatedElement", "<init>", "(Ljava/lang/reflect/AnnotatedElement;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getParameterAnnotations", "()[[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "unrollParameters", "([[Ljava/lang/annotation/Annotation;)[[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/MetaAnnotatedConstructor", "parameterAnnotations", "[[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterAnnotations", "()[[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/MetaAnnotatedConstructor", "parameterAnnotations", "[[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaringClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModifiers", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getModifiers", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterTypes", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGenericParameterTypes", "()[Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getGenericParameterTypes", "()[Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionTypes", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getExceptionTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGenericExceptionTypes", "()[Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getGenericExceptionTypes", "()[Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toGenericString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "toGenericString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isVarArgs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "isVarArgs", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSynthetic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/MetaAnnotatedConstructor", "get", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "isSynthetic", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

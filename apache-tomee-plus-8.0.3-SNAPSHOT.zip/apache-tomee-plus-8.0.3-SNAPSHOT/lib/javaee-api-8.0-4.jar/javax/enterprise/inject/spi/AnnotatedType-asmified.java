package asm.javax.enterprise.inject.spi;
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
public class AnnotatedTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/Annotated;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Annotated" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJavaClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConstructors", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/AnnotatedConstructor<TX;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethods", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/AnnotatedMethod<-TX;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFields", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/AnnotatedField<-TX;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotations", "(Ljava/lang/Class;)Ljava/util/Set;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)Ljava/util/Set<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotationsByType", "(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

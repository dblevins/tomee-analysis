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
public class IAnnotationFinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xbean/finder/IAnnotationFinder", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAnnotationPresent", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassesNotLoaded", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnnotatedPackages", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Package;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findInheritedAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnnotatedConstructors", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Constructor;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Field;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findClassesInPackage", "(Ljava/lang/String;Z)Ljava/util/List;", "(Ljava/lang/String;Z)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findSubclasses", "(Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<Ljava/lang/Class<+TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findImplementations", "(Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<Ljava/lang/Class<+TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findMetaAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findMetaAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Field;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findMetaAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/Class<*>;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotatedClassNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

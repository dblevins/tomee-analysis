package asm.org.apache.openejb.config;
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
public class AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler", "<A::Ljava/lang/annotation/Annotation;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "org/apache/openejb/config/AnnotationDeployer", "ProcessAnnotatedBeans", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "AnnotationHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotationClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<TA;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExistingDeclarations", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/openejb/jee/MethodAttribute;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addClassLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V", "(TA;Ljava/lang/Class;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addMethodLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V", "(TA;Ljava/lang/reflect/Method;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

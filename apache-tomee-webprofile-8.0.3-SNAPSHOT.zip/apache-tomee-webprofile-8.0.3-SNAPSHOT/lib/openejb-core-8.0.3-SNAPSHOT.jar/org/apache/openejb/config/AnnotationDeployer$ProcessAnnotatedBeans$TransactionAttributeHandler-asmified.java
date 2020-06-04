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
public class AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "Ljava/lang/Object;Lorg/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler<Ljakarta/ejb/TransactionAttribute;>;", "java/lang/Object", new String[] { "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler" });

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "org/apache/openejb/config/AnnotationDeployer", "ProcessAnnotatedBeans", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "TransactionAttributeHandler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "AnnotationHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "assemblyDescriptor", "Lorg/apache/openejb/jee/AssemblyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ejbName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "assemblyDescriptor", "Lorg/apache/openejb/jee/AssemblyDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "ejbName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExistingDeclarations", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/openejb/jee/MethodAttribute;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "assemblyDescriptor", "Lorg/apache/openejb/jee/AssemblyDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "ejbName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/AssemblyDescriptor", "getMethodTransactionMap", "(Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addClassLevelDeclaration", "(Ljakarta/ejb/TransactionAttribute;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/ContainerTransaction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ejb/TransactionAttribute", "value", "()Ljakarta/ejb/TransactionAttributeType;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "cast", "(Ljakarta/ejb/TransactionAttributeType;)Lorg/apache/openejb/jee/TransAttribute;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "ejbName", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("*");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/ContainerTransaction", "<init>", "(Lorg/apache/openejb/jee/TransAttribute;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "assemblyDescriptor", "Lorg/apache/openejb/jee/AssemblyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/AssemblyDescriptor", "getContainerTransaction", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMethodLevelDeclaration", "(Ljakarta/ejb/TransactionAttribute;Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/ContainerTransaction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ejb/TransactionAttribute", "value", "()Ljakarta/ejb/TransactionAttributeType;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "cast", "(Ljakarta/ejb/TransactionAttributeType;)Lorg/apache/openejb/jee/TransAttribute;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "ejbName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/ContainerTransaction", "<init>", "(Lorg/apache/openejb/jee/TransAttribute;Ljava/lang/String;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "assemblyDescriptor", "Lorg/apache/openejb/jee/AssemblyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/AssemblyDescriptor", "getContainerTransaction", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<Ljakarta/ejb/TransactionAttribute;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/TransactionAttribute;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "cast", "(Ljakarta/ejb/TransactionAttributeType;)Lorg/apache/openejb/jee/TransAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ejb/TransactionAttributeType", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/TransAttribute", "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addMethodLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/TransactionAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "addMethodLevelDeclaration", "(Ljakarta/ejb/TransactionAttribute;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addClassLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/TransactionAttribute");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$TransactionAttributeHandler", "addClassLevelDeclaration", "(Ljakarta/ejb/TransactionAttribute;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

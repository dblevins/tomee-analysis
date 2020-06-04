package asm.org.apache.myfaces.cdi.managedproperty;
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
public class ManagedPropertyProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer<Ljava/lang/Object;>;", "org/apache/myfaces/cdi/util/AbstractDynamicProducer", null);

classWriter.visitInnerClass("org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "ManagedPropertyAnnotationLiteral", 0);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/BeanManager;Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "<init>", "(Ljavax/enterprise/inject/spi/BeanManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/ParameterizedType");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/ParameterizedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/ParameterizedType", "getRawType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/Type", "getTypeName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "simpleClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "javax/enterprise/inject/spi/BeanManager", "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/Type", "getTypeName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "simpleJavaTypeToClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getExpression", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "id", "(Ljava/lang/String;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/Dependent;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "scope", "(Ljava/lang/Class;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getExpression", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "<init>", "(Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "qualifiers", "([Ljava/lang/annotation/Annotation;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "types", "([Ljava/lang/reflect/Type;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "beanClass", "(Ljava/lang/Class;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer;Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "lambda$new$0", "(Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false), Type.getType("(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "create", "(Ljava/util/function/Function;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createManagedProperty", "(Ljavax/enterprise/context/spi/CreationalContext;Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;)Ljava/lang/Object;", "(Ljavax/enterprise/context/spi/CreationalContext<Ljava/lang/Object;>;Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("@ManagedProperty(\"");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getExpression", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\") can only be resolved in a JSF request!");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/FacesException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/context/FacesContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo", "getExpression", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "evaluateExpressionGet", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$0", "(Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "createManagedProperty", "(Ljavax/enterprise/context/spi/CreationalContext;Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyInfo;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

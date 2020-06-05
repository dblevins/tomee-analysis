package asm.org.apache.cxf.bus.spring;
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
public class Jsr250BeanPostProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", null, "java/lang/Object", new String[] { "org/springframework/beans/factory/config/DestructionAwareBeanPostProcessor", "org/springframework/core/Ordered", "org/springframework/context/ApplicationContextAware" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Lorg/springframework/context/ApplicationContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isProcessing", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setApplicationContext", "(Lorg/springframework/context/ApplicationContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("org.springframework.context.annotation.CommonAnnotationBeanPostProcessor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/springframework/context/ApplicationContext", "getBeanNamesForType", "(Ljava/lang/Class;ZZ)[Ljava/lang/String;", true);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "org/springframework/context/ApplicationContext", "java/lang/Class"}, 1, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "org/springframework/context/ApplicationContext", "java/lang/Class"}, 2, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "org/springframework/context/ApplicationContext"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrder", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 1010);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "injectable", "(Ljava/lang/Object;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/injection/ResourceInjector", "processable", "(Ljava/lang/Class;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getResourceManager", "(Ljava/lang/Object;)Lorg/apache/cxf/resource/ResourceManager;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/springframework/beans/factory/NoSuchBeanDefinitionException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/resource/ResourceManager");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver", "<init>", "(Lorg/springframework/context/ApplicationContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/Bus");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/Bus");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/bus/spring/SpringBus");
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver", "<init>", "(Lorg/springframework/context/ApplicationContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/springframework/context/ApplicationContext", "getBean", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "java/lang/Object", Opcodes.INTEGER, "org/apache/cxf/resource/ResourceManager", "org/apache/cxf/Bus"}, 1, new Object[] {"org/springframework/beans/factory/NoSuchBeanDefinitionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/springframework/context/ApplicationContext", "getBean", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/Bus");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/bus/spring/SpringBus");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver", "<init>", "(Lorg/springframework/context/ApplicationContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postProcessAfterInitialization", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "resourceManager", "Lorg/apache/cxf/resource/ResourceManager;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "context", "Lorg/springframework/context/ApplicationContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/BusApplicationContextResourceResolver", "<init>", "(Lorg/springframework/context/ApplicationContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "injectable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/injection/ResourceInjector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "getResourceManager", "(Ljava/lang/Object;)Lorg/apache/cxf/resource/ResourceManager;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/injection/ResourceInjector", "<init>", "(Lorg/apache/cxf/resource/ResourceManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "construct", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postProcessBeforeInitialization", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/Bus");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "getResourceManager", "(Ljava/lang/Object;)Lorg/apache/cxf/resource/ResourceManager;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "injectable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/injection/ResourceInjector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "getResourceManager", "(Ljava/lang/Object;)Lorg/apache/cxf/resource/ResourceManager;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/injection/ResourceInjector", "<init>", "(Lorg/apache/cxf/resource/ResourceManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "inject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postProcessBeforeDestruction", "(Ljava/lang/Object;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "injectable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/injection/ResourceInjector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "getResourceManager", "(Ljava/lang/Object;)Lorg/apache/cxf/resource/ResourceManager;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/injection/ResourceInjector", "<init>", "(Lorg/apache/cxf/resource/ResourceManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/injection/ResourceInjector", "destroy", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresDestruction", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/Jsr250BeanPostProcessor", "isProcessing", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
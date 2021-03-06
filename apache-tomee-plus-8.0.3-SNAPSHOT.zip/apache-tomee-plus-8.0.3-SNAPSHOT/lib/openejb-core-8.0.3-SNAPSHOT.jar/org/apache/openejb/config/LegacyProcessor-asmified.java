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
public class LegacyProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/LegacyProcessor", null, "java/lang/Object", new String[] { "org/apache/openejb/config/DynamicDeployer" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deploy", "(Lorg/apache/openejb/config/AppModule;)Lorg/apache/openejb/config/AppModule;", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AppModule", "getEjbModules", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/EjbModule");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/EjbModule", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/EjbModule", "getEjbJar", "()Lorg/apache/openejb/jee/EjbJar;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/EjbJar", "getEnterpriseBeans", "()[Lorg/apache/openejb/jee/EnterpriseBean;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/config/LegacyProcessor", "org/apache/openejb/config/AppModule", "java/util/Iterator", "org/apache/openejb/config/EjbModule", "java/lang/ClassLoader", "[Lorg/apache/openejb/jee/EnterpriseBean;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EnterpriseBean", "getEjbClass", "()Ljava/lang/String;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/jee/EnterpriseBean"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EnterpriseBean", "getEjbClass", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/LegacyProcessor", "process", "(Ljava/lang/Class;Lorg/apache/openejb/jee/EnterpriseBean;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/config/LegacyProcessor", "org/apache/openejb/config/AppModule", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "process", "(Ljava/lang/Class;Lorg/apache/openejb/jee/EnterpriseBean;)V", "(Ljava/lang/Class<*>;Lorg/apache/openejb/jee/EnterpriseBean;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openejb/jee/SessionBean");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/SessionBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/SessionBean", "getSessionType", "()Lorg/apache/openejb/jee/SessionType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/SessionType", "STATEFUL", "Lorg/apache/openejb/jee/SessionType;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/SessionSynchronization;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/SessionBean", "getAfterBegin", "()Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/LifecycleCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("afterBegin");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/LifecycleCallback", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/SessionBean", "getBeforeCompletion", "()Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/LifecycleCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("beforeCompletion");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/LifecycleCallback", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/SessionBean", "getAfterCompletion", "()Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/LifecycleCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("afterCompletion");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/LifecycleCallback", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"java/lang/Class", "org/apache/openejb/jee/EnterpriseBean", "org/apache/openejb/jee/SessionBean"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/SessionBean;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/ResourceEnvRef");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jakarta.ejb.SessionBean/sessionContext");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/SessionContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/ResourceEnvRef", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/InjectionTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/InjectionTarget", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/InjectionTarget", "setInjectionTargetClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("sessionContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/InjectionTarget", "setInjectionTargetName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/ResourceEnvRef", "getInjectionTarget", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/SessionBean", "getResourceEnvRef", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openejb/jee/MessageDrivenBean");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/MessageDrivenBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/MessageDrivenBean;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/ResourceEnvRef");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jakarta.ejb.MessageDrivenBean/messageDrivenContext");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/MessageDrivenContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/ResourceEnvRef", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/InjectionTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/InjectionTarget", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/InjectionTarget", "setInjectionTargetClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("messageDrivenContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/InjectionTarget", "setInjectionTargetName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/ResourceEnvRef", "getInjectionTarget", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/MessageDrivenBean", "getResourceEnvRef", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

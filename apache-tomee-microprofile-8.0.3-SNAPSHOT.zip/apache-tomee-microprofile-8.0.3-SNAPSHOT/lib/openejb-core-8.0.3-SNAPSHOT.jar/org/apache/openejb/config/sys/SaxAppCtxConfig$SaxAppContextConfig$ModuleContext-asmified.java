package asm.org.apache.openejb.config.sys;
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
public class SaxAppCtxConfig$SaxAppContextConfig$ModuleContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", null, "org/xml/sax/helpers/DefaultHandler", null);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "org/apache/openejb/config/sys/SaxAppCtxConfig", "SaxAppContextConfig", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ModuleContext", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BeanContexts", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Pojos", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$MultipleConfiguration", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "MultipleConfiguration", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "id", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$800", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "id", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "push", "(Lorg/xml/sax/helpers/DefaultHandler;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$1200", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Lorg/apache/openejb/config/sys/SaxAppCtxConfig$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "push", "(Lorg/xml/sax/helpers/DefaultHandler;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$300", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$MultipleConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "id", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "propertiesForModule", "(Ljava/lang/String;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$MultipleConfiguration", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/lang/String;Ljava/util/Collection;Lorg/apache/openejb/config/sys/SaxAppCtxConfig$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "push", "(Lorg/xml/sax/helpers/DefaultHandler;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsupported Element: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "propertiesForModule", "(Ljava/lang/String;)Ljava/util/Collection;", "(Ljava/lang/String;)Ljava/util/Collection<Ljava/util/Properties;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$400", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;)Lorg/apache/openejb/config/AppModule;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AppModule", "getDeploymentModule", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Collection", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/DeploymentModule");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig", "access$2200", "(Ljava/lang/String;Lorg/apache/openejb/config/DeploymentModule;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/config/DeploymentModule", "getProperties", "()Ljava/util/Properties;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

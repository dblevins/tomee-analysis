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
public class SaxAppCtxConfig$SaxAppContextConfig$BeanContextsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", null, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", null);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "org/apache/openejb/config/sys/SaxAppCtxConfig", "SaxAppContextConfig", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BeanContexts", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContext", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BeanContext", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Pojos", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "id", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$2300", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "childParser", "(Ljava/lang/String;Lorg/apache/openejb/config/sys/PojoConfig;)Lorg/xml/sax/helpers/DefaultHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "id", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/sys/BeanContextConfig");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContext", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/config/sys/BeanContextConfig;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newItem", "()Lorg/apache/openejb/config/sys/PojoConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/BeanContextConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/BeanContextConfig", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "genericConfigs", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/sys/PojoConfig");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/PojoConfig", "hasProperties", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "this$0", "Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "access$1800", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;)Lorg/apache/openejb/config/BeanProperties;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "id", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/PojoConfig", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/BeanProperties", "addGlobalProperties", "(Ljava/lang/String;Ljava/util/Properties;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

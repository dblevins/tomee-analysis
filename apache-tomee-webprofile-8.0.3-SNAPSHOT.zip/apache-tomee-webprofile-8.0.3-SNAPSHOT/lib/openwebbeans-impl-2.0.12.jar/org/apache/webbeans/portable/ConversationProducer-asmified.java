package asm.org.apache.webbeans.portable;
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
public class ConversationProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/ConversationProducer", "Lorg/apache/webbeans/portable/InjectionTargetImpl<Lorg/apache/webbeans/conversation/ConversationImpl;>;", "org/apache/webbeans/portable/InjectionTargetImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contextsService", "Lorg/apache/webbeans/spi/ContextsService;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljavax/enterprise/inject/spi/AnnotatedType<Lorg/apache/webbeans/conversation/ConversationImpl;>;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/InjectionTargetImpl", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getContextsService", "()Lorg/apache/webbeans/spi/ContextsService;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/ConversationProducer", "contextsService", "Lorg/apache/webbeans/spi/ContextsService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newInstance", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl;)Lorg/apache/webbeans/conversation/ConversationImpl;", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl<Lorg/apache/webbeans/conversation/ConversationImpl;>;)Lorg/apache/webbeans/conversation/ConversationImpl;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/ConversationProducer", "contextsService", "Lorg/apache/webbeans/spi/ContextsService;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ConversationScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "getCurrentContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/webbeans/context/ConversationContext");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/context/ConversationContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/context/ConversationContext", "getConversation", "()Lorg/apache/webbeans/conversation/ConversationImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/context/spi/Context"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/context/ContextNotActiveException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WebBeans context with scope type annotation @ConversationScoped does not exist within current thread");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/context/ContextNotActiveException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "newInstance", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/ConversationProducer", "newInstance", "(Lorg/apache/webbeans/context/creational/CreationalContextImpl;)Lorg/apache/webbeans/conversation/ConversationImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

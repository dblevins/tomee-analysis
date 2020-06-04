package asm.com.sun.xml.bind.v2.runtime;
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
public class ArrayBeanInfoImpl$ArrayLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", null, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", new String[] { "com/sun/xml/bind/v2/runtime/unmarshaller/Receiver" });

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl", "ArrayLoader", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "State", ACC_PUBLIC | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "itemLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl;Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", "this$0", "Lcom/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl", "access$000", "(Lcom/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl;)Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getLoader", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Z)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", "itemLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setTarget", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "leaveElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", "this$0", "Lcom/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "getTarget", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl", "toArray", "(Ljava/util/List;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setTarget", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "childElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("item");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/TagName", "matches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/ArrayBeanInfoImpl$ArrayLoader", "itemLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setLoader", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setReceiver", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "childElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpectedChildElements", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("item");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "receive", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "getTarget", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

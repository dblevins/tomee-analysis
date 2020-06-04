package asm.org.apache.openejb.sxc;
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
public class HandlerChainsXmlDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/sxc/HandlerChainsXml", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarshal", "(Ljava/io/InputStream;)Lorg/apache/openejb/jee/HandlerChains;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/HandlerChains$JAXB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/HandlerChains$JAXB", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "unmarshalJavaee", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/HandlerChains");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarshal", "(Ljava/net/URL;)Lorg/apache/openejb/jee/HandlerChains;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, null);
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label2, label7, label6, null);
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label8, label5, label9, null);
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label2, label10, label9, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/IO", "read", "(Ljava/net/URL;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "prepareReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/Adapters", "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/Adapters", "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/HandlerChainsStringQNameAdapter", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/HandlerChains$JAXB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/HandlerChains$JAXB", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "unmarhsal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/HandlerChains");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/Adapters", "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/HandlerChainsStringQNameAdapter", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/IO", "close", "(Ljava/io/Closeable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/net/URL", "java/io/InputStream", "javax/xml/stream/XMLStreamReader", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/Adapters", "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/HandlerChainsStringQNameAdapter", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/net/URL", "java/io/InputStream"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/IO", "close", "(Ljava/io/Closeable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "marshal", "(Lorg/apache/openejb/jee/HandlerChains;Ljava/io/OutputStream;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/HandlerChains$JAXB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/HandlerChains$JAXB", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamResult", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "marshal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

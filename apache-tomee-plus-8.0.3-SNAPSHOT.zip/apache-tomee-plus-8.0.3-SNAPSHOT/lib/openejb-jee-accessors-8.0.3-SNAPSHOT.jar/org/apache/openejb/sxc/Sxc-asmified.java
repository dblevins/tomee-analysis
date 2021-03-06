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
public class SxcDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/sxc/Sxc", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "marshall", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/lang/Object;Ljava/io/OutputStream;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamResult", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "marshal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "marshal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "javax/xml/stream/XMLStreamException");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "javax/xml/stream/XMLStreamException");
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label12, null);
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitTryCatchBlock(label13, label14, label15, "javax/xml/stream/XMLStreamException");
Label label16 = new Label();
methodVisitor.visitTryCatchBlock(label11, label16, label12, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label17);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("result is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/transform/stream/StreamResult");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNE, label18);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("result is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label19);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("object is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label20);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jaxbObject is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "getXmOutputFactory", "()Ljavax/xml/stream/XMLOutputFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/stream/StreamResult", "getOutputStream", "()Ljava/io/OutputStream;", false);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLOutputFactory", "createXMLStreamWriter", "(Ljava/io/OutputStream;Ljava/lang/String;)Ljavax/xml/stream/XMLStreamWriter;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/PrettyPrintXMLStreamWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/PrettyPrintXMLStreamWriter", "<init>", "(Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamWriterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamWriterImpl", "<init>", "(Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeStartDocument", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/jaxb/RuntimeContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "org/metatype/sxc/jaxb/ExtendedMarshaller");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/RuntimeContext", "<init>", "(Lorg/metatype/sxc/jaxb/ExtendedMarshaller;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/JAXBObject", "getXmlRootElement", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeStartElementWithAutoPrefix", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/JAXBObject", "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Object;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label1);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter", "javax/xml/stream/XMLOutputFactory", "org/metatype/sxc/util/XoXMLStreamWriter", "org/metatype/sxc/jaxb/RuntimeContext"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/xml/bind/JAXBException");
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/metatype/sxc/util/RuntimeXMLStreamException");
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(CHECKCAST, "org/metatype/sxc/util/RuntimeXMLStreamException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/RuntimeXMLStreamException", "getCause", "()Ljavax/xml/stream/XMLStreamException;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/stream/XMLStreamException");
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label24);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/xml/bind/JAXBException");
Label label25 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label25);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/MarshalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label26 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label26);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label27 = new Label();
methodVisitor.visitJumpInsn(GOTO, label27);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter", "javax/xml/stream/XMLOutputFactory", "org/metatype/sxc/util/XoXMLStreamWriter", "org/metatype/sxc/jaxb/RuntimeContext", "java/lang/Exception", "java/lang/Throwable"}, 2, new Object[] {label25, label25});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter", "javax/xml/stream/XMLOutputFactory", "org/metatype/sxc/util/XoXMLStreamWriter", "org/metatype/sxc/jaxb/RuntimeContext", "java/lang/Exception", "java/lang/Throwable"}, 3, new Object[] {label25, label25, "java/lang/Throwable"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/MarshalException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/MarshalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/MarshalException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeEndDocument", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter", "javax/xml/stream/XMLOutputFactory", "org/metatype/sxc/util/XoXMLStreamWriter"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/MarshalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/MarshalException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label28 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label28);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "close", "()V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label28);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label28);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not close XMLStreamWriter.");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label16);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "close", "()V", true);
methodVisitor.visitLabel(label14);
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/metatype/sxc/jaxb/JAXBObject", "java/lang/Object", "javax/xml/transform/Result", "javax/xml/transform/stream/StreamResult", "javax/xml/stream/XMLStreamWriter"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarshalJavaee", "(Ljava/net/URL;Lorg/metatype/sxc/jaxb/JAXBObject;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/net/URL;Lorg/metatype/sxc/jaxb/JAXBObject<TT;>;)TT;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "unmarshalJavaee", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"java/net/URL", "org/metatype/sxc/jaxb/JAXBObject", "java/io/InputStream", "java/lang/Throwable", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/net/URL", "org/metatype/sxc/jaxb/JAXBObject", "java/io/InputStream", "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/net/URL", "org/metatype/sxc/jaxb/JAXBObject", "java/io/InputStream", "java/lang/Throwable", Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarshalJavaee", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljava/io/InputStream;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Lorg/metatype/sxc/jaxb/JAXBObject<TT;>;Ljava/io/InputStream;)TT;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "prepareReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "unmarhsal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "prepareReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamSource", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "getXmlInputFactory", "()Ljavax/xml/stream/XMLInputFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "createXMLStreamReader", "(Ljavax/xml/transform/Source;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/sxc/JavaeeNamespaceFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/sxc/JavaeeNamespaceFilter", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarhsal", "(Lorg/metatype/sxc/jaxb/JAXBObject;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Lorg/metatype/sxc/jaxb/JAXBObject<TT;>;Ljavax/xml/stream/XMLStreamReader;)TT;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/sxc/Sxc", "unmarshall", "(Lorg/metatype/sxc/jaxb/JAXBObject;Lorg/metatype/sxc/util/XoXMLStreamReader;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmarshall", "(Lorg/metatype/sxc/jaxb/JAXBObject;Lorg/metatype/sxc/util/XoXMLStreamReader;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Lorg/metatype/sxc/jaxb/JAXBObject<TT;>;Lorg/metatype/sxc/util/XoXMLStreamReader;)TT;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getEventType", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "next", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/jaxb/RuntimeContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "org/metatype/sxc/jaxb/ExtendedUnmarshaller");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/RuntimeContext", "<init>", "(Lorg/metatype/sxc/jaxb/ExtendedUnmarshaller;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/JAXBObject", "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getXmlInputFactory", "()Ljavax/xml/stream/XMLInputFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/sxc/Sxc;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/sxc/Sxc;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitLdcInsn("com.sun.xml.internal.stream.XMLInputFactoryImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLInputFactory");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/stream/properties/ignore-external-dtd");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/lang/ClassLoader", "javax/xml/stream/XMLInputFactory"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/XMLInputFactory", "newInstance", "()Ljavax/xml/stream/XMLInputFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax.xml.stream.isValidating");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax.xml.stream.isNamespaceAware");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax.xml.stream.supportDTD");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getXmOutputFactory", "()Ljavax/xml/stream/XMLOutputFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/sxc/Sxc;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/XMLOutputFactory", "newInstance", "()Ljavax/xml/stream/XMLOutputFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

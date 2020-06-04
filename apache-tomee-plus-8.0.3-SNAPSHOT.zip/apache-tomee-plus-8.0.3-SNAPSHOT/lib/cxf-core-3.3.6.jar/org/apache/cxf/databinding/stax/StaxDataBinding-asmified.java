package asm.org.apache.cxf.databinding.stax;
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
public class StaxDataBindingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/databinding/stax/StaxDataBinding", null, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", null);

classWriter.visitInnerClass("org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter", "org/apache/cxf/databinding/stax/StaxDataBinding", "XMLStreamDataWriter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader", "org/apache/cxf/databinding/stax/StaxDataBinding", "XMLStreamDataReader", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/databinding/stax/StaxDataBinding$RemoveStaxInEndingInterceptor", "org/apache/cxf/databinding/stax/StaxDataBinding", "RemoveStaxInEndingInterceptor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/databinding/stax/StaxDataBinding$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xsrReader", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xswWriter", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "xsrReader", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "xswWriter", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "inInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/StaxInEndingInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("post-invoke");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/StaxInEndingInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "inFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/StaxInEndingInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("post-invoke");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/StaxInEndingInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "inInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/databinding/stax/StaxDataBinding$RemoveStaxInEndingInterceptor", "INSTANCE", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$RemoveStaxInEndingInterceptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "inFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/databinding/stax/StaxDataBinding$RemoveStaxInEndingInterceptor", "INSTANCE", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$RemoveStaxInEndingInterceptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/cxf/service/Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/service/Service", "getServiceInfos", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/ServiceInfo");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/ServiceInfo", "getXmlSchemaCollection", "()Lorg/apache/cxf/common/xmlschema/SchemaCollection;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/xmlschema/SchemaCollection", "getXmlSchemas", "()[Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/service/model/ServiceInfo", "org/apache/cxf/common/xmlschema/SchemaCollection"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/databinding/stax/StaxDataBinding$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/databinding/stax/StaxDataBinding$1", "<init>", "(Lorg/apache/cxf/databinding/stax/StaxDataBinding;Lorg/apache/cxf/service/model/ServiceInfo;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/databinding/stax/StaxDataBinding$1", "walk", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Ljava/lang/Class;)Lorg/apache/cxf/databinding/DataReader;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/cxf/databinding/DataReader<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamReader;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "xsrReader", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataReader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The type ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is not supported.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSupportedReaderFormats", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamReader;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createWriter", "(Ljava/lang/Class;)Lorg/apache/cxf/databinding/DataWriter;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/cxf/databinding/DataWriter<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamWriter;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/stax/StaxDataBinding", "xswWriter", "Lorg/apache/cxf/databinding/stax/StaxDataBinding$XMLStreamDataWriter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The type ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is not supported.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSupportedWriterFormats", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamWriter;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Node;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

package asm.org.apache.activemq.store.kahadb.plist;
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
public class PListStoreImpl$MetaDataMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "Lorg/apache/activemq/store/kahadb/disk/util/VariableMarshaller<Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;>;", "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "MetaDataMarshaller", 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "MetaData", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "store", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "store", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readPayload", "(Ljava/io/DataInput;)Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "store", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "<init>", "(Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "read", "(Ljava/io/DataInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writePayload", "(Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "write", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "readPayload", "(Ljava/io/DataInput;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "readPayload", "(Ljava/io/DataInput;)Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "writePayload", "(Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "writePayload", "(Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

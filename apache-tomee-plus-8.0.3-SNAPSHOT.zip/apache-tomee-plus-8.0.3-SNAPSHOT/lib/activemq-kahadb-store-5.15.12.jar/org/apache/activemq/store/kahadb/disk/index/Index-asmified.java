package asm.org.apache.activemq.store.kahadb.disk.index;
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
public class IndexDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/store/kahadb/disk/index/Index", "<Key:Ljava/lang/Object;Value:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller<TKey;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller<TValue;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unload", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clear", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containsKey", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Z", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;)Z", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;)TValue;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;TValue;)TValue;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;)TValue;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isTransient", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator<Ljava/util/Map$Entry<TKey;TValue;>;>;", new String[] { "java/io/IOException", "java/lang/UnsupportedOperationException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

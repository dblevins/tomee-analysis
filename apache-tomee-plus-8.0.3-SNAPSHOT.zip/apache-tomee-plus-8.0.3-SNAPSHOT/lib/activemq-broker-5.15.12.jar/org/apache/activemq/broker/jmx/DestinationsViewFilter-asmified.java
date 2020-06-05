package asm.org.apache.activemq.broker.jmx;
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
public class DestinationsViewFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/jmx/DestinationsViewFilter", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/DestinationsViewFilter$2", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/DestinationsViewFilter$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/google/common/collect/ImmutableMap$Builder", "com/google/common/collect/ImmutableMap", "Builder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "filter", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sortColumn", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sortOrder", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "destinations", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortColumn", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("asc");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortOrder", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/lang/String;)Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/DestinationsViewFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/ObjectMapper"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("{}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/DestinationsViewFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "readerFor", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectReader;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectReader", "readValue", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/jmx/DestinationsViewFilter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDestinations", "(Ljava/util/Map;)Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;", "(Ljava/util/Map<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;)Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "filter", "(II)Ljava/lang/String;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "getPredicate", "()Lcom/google/common/base/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Maps", "filterValues", "(Ljava/util/Map;Lcom/google/common/base/Predicate;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "getPagedDestinations", "(II)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("data");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("count");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/io/StringWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "writeValue", "(Ljava/io/Writer;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/StringWriter", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getPagedDestinations", "(II)Ljava/util/Map;", "(II)Ljava/util/Map<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/ImmutableMap", "builder", "()Lcom/google/common/collect/ImmutableMap$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "getOrdering", "()Lcom/google/common/collect/Ordering;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/collect/Ordering", "sortedCopy", "(Ljava/lang/Iterable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/activemq/broker/jmx/DestinationsViewFilter", Opcodes.INTEGER, Opcodes.INTEGER, "com/google/common/collect/ImmutableMap$Builder", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/collect/ImmutableMap$Builder", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map$Entry"}, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/collect/ImmutableMap$Builder", "build", "()Lcom/google/common/collect/ImmutableMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getPredicate", "()Lcom/google/common/base/Predicate;", "()Lcom/google/common/base/Predicate<Lorg/apache/activemq/broker/jmx/DestinationView;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/DestinationsViewFilter$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter$1", "<init>", "(Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getOrdering", "()Lcom/google/common/collect/Ordering;", "()Lcom/google/common/collect/Ordering<Ljava/util/Map$Entry<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "<init>", "(Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestinations", "()Ljava/util/Map;", "()Ljava/util/Map<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "destinations", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilter", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "filter", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFilter", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "filter", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSortOrder", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortOrder", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSortOrder", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortOrder", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSortColumn", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortColumn", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSortColumn", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "sortColumn", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

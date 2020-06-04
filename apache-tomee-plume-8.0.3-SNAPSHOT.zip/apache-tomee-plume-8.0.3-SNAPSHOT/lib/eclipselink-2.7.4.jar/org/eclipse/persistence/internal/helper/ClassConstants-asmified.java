package asm.org.eclipse.persistence.internal.helper;
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
public class ClassConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/helper/ClassConstants", null, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Hashtable_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Enumeration_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JavaSqlTime_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JavaSqlDate_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JavaSqlTimestamp_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "List_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Map_Entry_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Object_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SortedSet_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URL_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Vector_class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HashSet_class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Void_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PropertyChangeEvent_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Accessor_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConversionManager_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CursoredStream_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseQuery_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseRow_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OldDescriptorEvent_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DescriptorEvent_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DirectConnector_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Expression_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArgumentListFunctionExpression_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectContainer_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectList_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectSet_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LogicalExpression_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PublicInterfaceDatabaseSession_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PerformanceProfiler_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PublicInterfaceSession_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QueryKey_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RelationExpression_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Record_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ServerSession_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SessionsSession_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ScrollableCursor_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueHolderInterface_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionChangeEvent_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MapChangeEvent_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ChangeTracker_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WeavedAttributeValueHolderInterface_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PersistenceWeavedLazy_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CacheIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FullIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HardCacheWeakIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NoIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SoftCacheWeakIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SoftIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WeakIdentityMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FetchGroupTracker_class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ABYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AOBJECT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APBYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APCHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIGDECIMAL", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIGINTEGER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GREGORIAN_CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTEGER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NUMBER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PBOOLEAN", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PBYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PCHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PDOUBLE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PFLOAT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PINT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PLONG", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PSHORT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQLDATE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRING", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UTILDATE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_LDATE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_LTIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_LDATETIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_ODATETIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_OTIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QNAME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_GREGORIAN_CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DURATION", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BLOB", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOB", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOCONVERSION", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOCUMENT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NODE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Hashtable;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Hashtable_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Enumeration;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Enumeration_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Time;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlTime_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Date;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlDate_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Timestamp;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "JavaSqlTimestamp_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "List_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map$Entry;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Map_Entry_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Object_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/SortedSet;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SortedSet_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URL;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "URL_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Vector;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Vector_class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/HashSet;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "HashSet_class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Void_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/beans/PropertyChangeEvent;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PropertyChangeEvent_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/databaseaccess/Accessor;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Accessor_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/helper/ConversionManager;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ConversionManager_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/queries/CursoredStream;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CursoredStream_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/queries/DatabaseQuery;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DatabaseQuery_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/sessions/AbstractRecord;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DatabaseRow_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/DescriptorEvent;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "OldDescriptorEvent_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/DescriptorEvent;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DescriptorEvent_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/DirectConnector;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DirectConnector_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/expressions/Expression;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Expression_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/expressions/FunctionExpression;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FunctionExpression_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/expressions/ArgumentListFunctionExpression;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ArgumentListFunctionExpression_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/indirection/IndirectContainer;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "IndirectContainer_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectList_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "IndirectList_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectSet_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "IndirectSet_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectMap_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "IndirectMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/expressions/LogicalExpression;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "LogicalExpression_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/sessions/DatabaseSessionImpl;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PublicInterfaceDatabaseSession_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/tools/profiler/PerformanceProfiler;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PerformanceProfiler_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/sessions/AbstractSession;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PublicInterfaceSession_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/mappings/querykeys/QueryKey;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "QueryKey_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/expressions/RelationExpression;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "RelationExpression_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/Record;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "Record_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/server/ServerSession;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ServerSession_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/Session;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SessionsSession_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/queries/ScrollableCursor;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ScrollableCursor_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/indirection/ValueHolderInterface;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ValueHolderInterface_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/changetracking/CollectionChangeEvent;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CollectionChangeEvent_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/changetracking/MapChangeEvent;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "MapChangeEvent_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/changetracking/ChangeTracker;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ChangeTracker_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/indirection/WeavedAttributeValueHolderInterface;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "WeavedAttributeValueHolderInterface_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/weaving/PersistenceWeavedLazy;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PersistenceWeavedLazy_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/CacheIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CacheIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/FullIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FullIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/HardCacheWeakIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "HardCacheWeakIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/NoIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "NoIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/SoftCacheWeakIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SoftCacheWeakIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/SoftIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SoftIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/identitymaps/WeakIdentityMap;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "WeakIdentityMap_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/queries/FetchGroupTracker;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FetchGroupTracker_class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Byte;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ABYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "AOBJECT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Character;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "ACHAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "APBYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[C"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "APCHAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BIGDECIMAL", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BIGINTEGER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CLASS", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CHAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Calendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DOUBLE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FLOAT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/GregorianCalendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "GREGORIAN_CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "INTEGER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "LONG", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Number;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "NUMBER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "OBJECT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PBOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PBYTE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PCHAR", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PDOUBLE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PFLOAT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PINT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PLONG", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PSHORT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SHORT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Date;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SQLDATE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Time;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Timestamp;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIMESTAMP", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Date;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "UTILDATE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalDate;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME_LDATE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalTime;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME_LTIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalDateTime;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME_LDATETIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/OffsetDateTime;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME_ODATETIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/OffsetTime;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "TIME_OTIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/namespace/QName;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "QNAME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/datatype/XMLGregorianCalendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "XML_GREGORIAN_CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/datatype/Duration;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DURATION", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Blob;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BLOB", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Clob;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CLOB", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/helper/NoConversion;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "NOCONVERSION", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Document;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DOCUMENT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Node;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "NODE", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

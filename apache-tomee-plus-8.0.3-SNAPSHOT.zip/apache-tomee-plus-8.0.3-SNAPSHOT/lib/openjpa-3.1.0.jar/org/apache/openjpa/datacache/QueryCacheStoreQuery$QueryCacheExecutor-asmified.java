package asm.org.apache.openjpa.datacache;
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
public class QueryCacheStoreQuery$QueryCacheExecutorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", null, "java/lang/Object", new String[] { "org/apache/openjpa/kernel/StoreQuery$Executor" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/kernel/StoreQuery", "Executor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "QueryCacheExecutor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/kernel/StoreQuery", "Range", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_candidate", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_subs", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_fc", "Lorg/apache/openjpa/kernel/FetchConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/StoreQuery$Executor;Lorg/apache/openjpa/meta/ClassMetaData;ZLorg/apache/openjpa/kernel/FetchConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/meta/ClassMetaData", Opcodes.INTEGER, "org/apache/openjpa/kernel/FetchConfiguration"}, 1, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/meta/ClassMetaData", Opcodes.INTEGER, "org/apache/openjpa/kernel/FetchConfiguration"}, 2, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "java/lang/Class"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_candidate", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_subs", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_fc", "Lorg/apache/openjpa/kernel/FetchConfiguration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeQuery", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/QueryCacheStoreQuery");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getDelegate", "()Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getCompilation", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "isPacking", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_candidate", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_subs", "Z");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/StoreQuery$Range", "start", "J");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/StoreQuery$Range", "end", "J");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryKey", "newInstance", "(Lorg/apache/openjpa/kernel/QueryContext;Z[Ljava/lang/Object;Ljava/lang/Class;ZJJLjava/lang/Object;)Lorg/apache/openjpa/datacache/QueryKey;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getStoreContext", "()Lorg/apache/openjpa/kernel/StoreContext;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "pushFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_fc", "Lorg/apache/openjpa/kernel/FetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "getFields", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_fc", "Lorg/apache/openjpa/kernel/FetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "getFields", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/kernel/StoreQuery", "[Ljava/lang/Object;", "org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "java/lang/Object", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/StoreContext", "org/apache/openjpa/kernel/FetchConfiguration"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getQueryExpressions", "()[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "fetchPaths", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 15);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 16, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/kernel/StoreQuery", "[Ljava/lang/Object;", "org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "java/lang/Object", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/StoreContext", "org/apache/openjpa/kernel/FetchConfiguration", "[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", Opcodes.INTEGER, Opcodes.INTEGER, "org/apache/openjpa/kernel/exps/QueryExpressions", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 14);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(15, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "fetchInnerPaths", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 15);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 14);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(15, 1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/kernel/StoreQuery", "[Ljava/lang/Object;", "org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "java/lang/Object", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/StoreContext", "org/apache/openjpa/kernel/FetchConfiguration", "[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "access$000", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;Lorg/apache/openjpa/datacache/QueryKey;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/rop/ListResultObjectProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/rop/ListResultObjectProvider", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "popFetchConfiguration", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "popFetchConfiguration", "()V", true);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "popFetchConfiguration", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getDelegate", "()Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "executeQuery", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_fc", "Lorg/apache/openjpa/kernel/FetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "getQueryCacheEnabled", "()Z", true);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "access$100", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;Lorg/apache/openjpa/lib/rop/ResultObjectProvider;Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/lib/rop/ResultObjectProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 18);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryExpressions", "()[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getQueryExpressions", "()[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "clearAccessPath", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "getAccessPathMetaDatas", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Lorg/apache/openjpa/meta/ClassMetaData;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Lorg/apache/openjpa/meta/ClassMetaData;"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/QueryCacheStoreQuery");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getCache", "()Lorg/apache/openjpa/datacache/QueryCache;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/datacache/TypesChangedEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/TypesChangedEvent", "<init>", "(Ljava/lang/Object;Ljava/util/Collection;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/QueryCache", "onTypesChanged", "(Lorg/apache/openjpa/datacache/TypesChangedEvent;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDataCache", "()Lorg/apache/openjpa/datacache/DataCache;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDataCache", "()Lorg/apache/openjpa/datacache/DataCache;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/DataCache", "getEvictOnBulkUpdate", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDataCache", "()Lorg/apache/openjpa/datacache/DataCache;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/DataCache", "removeAll", "(Ljava/lang/Class;Z)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeDelete", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "executeDelete", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "clearAccessPath", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "clearAccessPath", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeUpdate", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "executeUpdate", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "clearAccessPath", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "clearAccessPath", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStoreActions", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "validate", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRange", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getRange", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderingValue", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getOrderingValue", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAscending", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getAscending", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Z", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPacking", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "isPacking", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlias", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getAlias", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResultClass", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/Class;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getResultClass", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResultShape", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/ResultShape;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/ResultShape<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getResultShape", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/ResultShape;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProjectionAliases", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getProjectionAliases", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProjectionTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/Class;", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getProjectionTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAccessPathMetaDatas", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Lorg/apache/openjpa/meta/ClassMetaData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getAccessPathMetaDatas", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Lorg/apache/openjpa/meta/ClassMetaData;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOperation", "(Lorg/apache/openjpa/kernel/StoreQuery;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getOperation", "(Lorg/apache/openjpa/kernel/StoreQuery;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAggregate", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "isAggregate", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDistinct", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "isDistinct", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasGrouping", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "hasGrouping", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderedParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/lib/util/OrderedMap;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/lib/util/OrderedMap<Ljava/lang/Object;Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getOrderedParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/lib/util/OrderedMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/commons/collections4/map/LinkedMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/commons/collections4/map/LinkedMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toParameterArray", "(Lorg/apache/openjpa/kernel/StoreQuery;Ljava/util/Map;)[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "toParameterArray", "(Lorg/apache/openjpa/kernel/StoreQuery;Ljava/util/Map;)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUpdates", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "_ex", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "getUpdates", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "unwrap", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/StoreQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/QueryCacheStoreQuery");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getDelegate", "()Lorg/apache/openjpa/kernel/StoreQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

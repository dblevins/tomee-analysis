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
public class QueryCacheStoreQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/datacache/QueryCacheStoreQuery", null, "java/lang/Object", new String[] { "org/apache/openjpa/kernel/StoreQuery" });

classWriter.visitInnerClass("org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "CachedObjectId", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/datacache/QueryCacheStoreQuery$CachingResultObjectProvider", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "CachingResultObjectProvider", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedList", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "CachedList", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "org/apache/openjpa/datacache/QueryCacheStoreQuery", "QueryCacheExecutor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/kernel/StoreQuery", "Executor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/datacache/AbstractQueryCache$EvictPolicy", "org/apache/openjpa/datacache/AbstractQueryCache", "EvictPolicy", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_query", "Lorg/apache/openjpa/kernel/StoreQuery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_cache", "Lorg/apache/openjpa/datacache/QueryCache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_sctx", "Lorg/apache/openjpa/kernel/StoreContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_repos", "Lorg/apache/openjpa/meta/MetaDataRepository;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/StoreQuery;Lorg/apache/openjpa/datacache/QueryCache;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCache", "()Lorg/apache/openjpa/datacache/QueryCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Lorg/apache/openjpa/kernel/StoreQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkCache", "(Lorg/apache/openjpa/datacache/QueryKey;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/util/List;", "(Lorg/apache/openjpa/datacache/QueryKey;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/util/List<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "getQueryCacheEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/kernel/FetchConfiguration"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/FetchConfiguration", "getReadLockLevel", "()I", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/QueryCache", "get", "(Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/datacache/QueryResult;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/datacache/QueryResult"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/datacache/AbstractQueryCache");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/AbstractQueryCache");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/AbstractQueryCache", "getEvictPolicy", "()Lorg/apache/openjpa/datacache/AbstractQueryCache$EvictPolicy;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/datacache/AbstractQueryCache$EvictPolicy", "TIMESTAMP", "Lorg/apache/openjpa/datacache/AbstractQueryCache$EvictPolicy;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryKey", "getAcessPathClassNames", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/AbstractQueryCache", "getAllEntityTimestamp", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryResult", "getTimestamp", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/datacache/QueryResult", "org/apache/openjpa/datacache/AbstractQueryCache", "java/util/Set", "java/util/List", "java/util/List", Opcodes.LONG, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitInsn(LCMP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFGT, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/AbstractQueryCache", "remove", "(Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/datacache/QueryResult;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/datacache/QueryResult"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryResult", "isEmpty", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getProjectionAliases", "()[Ljava/lang/String;", true);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getStoreContext", "()Lorg/apache/openjpa/kernel/StoreContext;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "isCached", "(Ljava/util/List;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitInsn(ICONST_1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/datacache/QueryResult", Opcodes.INTEGER}, 3, new Object[] {label8, label8, "org/apache/openjpa/datacache/QueryResult"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/datacache/QueryKey", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/kernel/FetchConfiguration", "org/apache/openjpa/datacache/QueryResult", Opcodes.INTEGER}, 4, new Object[] {label8, label8, "org/apache/openjpa/datacache/QueryResult", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_sctx", "Lorg/apache/openjpa/kernel/StoreContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedList", "<init>", "(Lorg/apache/openjpa/datacache/QueryResult;ZLorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrapResult", "(Lorg/apache/openjpa/lib/rop/ResultObjectProvider;Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachingResultObjectProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getProjectionAliases", "()[Ljava/lang/String;", true);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/lib/rop/ResultObjectProvider", "org/apache/openjpa/datacache/QueryKey"}, 4, new Object[] {label0, label0, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/lib/rop/ResultObjectProvider"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/lib/rop/ResultObjectProvider", "org/apache/openjpa/datacache/QueryKey"}, 5, new Object[] {label0, label0, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "org/apache/openjpa/lib/rop/ResultObjectProvider", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachingResultObjectProvider", "<init>", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;Lorg/apache/openjpa/lib/rop/ResultObjectProvider;ZLorg/apache/openjpa/datacache/QueryKey;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "copyProjection", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/meta/JavaTypes", "getTypeCode", "(Ljava/lang/Class;)I", false);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(9, 29, label2, new Label[] { label1, label2, label2, label2, label2, label3, label2, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label4, label2, label2, label1 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Date");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Locale");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Locale", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId", "oid", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "fromObjectId", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "getObjectId", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$CachedObjectId", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "fromObjectId", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "find", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/FetchConfiguration;Ljava/util/BitSet;Ljava/lang/Object;I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/ObjectNotFoundException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/ObjectNotFoundException", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeReplace", "()Ljava/lang/Object;", null, new String[] { "java/io/ObjectStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContext", "(Lorg/apache/openjpa/kernel/QueryContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "setContext", "(Lorg/apache/openjpa/kernel/QueryContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getStoreContext", "()Lorg/apache/openjpa/kernel/StoreContext;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_sctx", "Lorg/apache/openjpa/kernel/StoreContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_sctx", "Lorg/apache/openjpa/kernel/StoreContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "getConfiguration", "()Lorg/apache/openjpa/conf/OpenJPAConfiguration;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_repos", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQuery", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "setQuery", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilterListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/FilterListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getFilterListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/FilterListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAggregateListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/AggregateListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getAggregateListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/AggregateListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newCompilationKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "newCompilationKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newCompilation", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "newCompilation", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompilation", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "getCompilation", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "populateFromCompilation", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "populateFromCompilation", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invalidateCompilation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "invalidateCompilation", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsDataStoreExecution", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "supportsDataStoreExecution", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsInMemoryExecution", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "supportsInMemoryExecution", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInMemoryExecutor", "(Lorg/apache/openjpa/meta/ClassMetaData;Z)Lorg/apache/openjpa/kernel/StoreQuery$Executor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "newInMemoryExecutor", "(Lorg/apache/openjpa/meta/ClassMetaData;Z)Lorg/apache/openjpa/kernel/StoreQuery$Executor;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newDataStoreExecutor", "(Lorg/apache/openjpa/meta/ClassMetaData;Z)Lorg/apache/openjpa/kernel/StoreQuery$Executor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "newDataStoreExecutor", "(Lorg/apache/openjpa/meta/ClassMetaData;Z)Lorg/apache/openjpa/kernel/StoreQuery$Executor;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery$QueryCacheExecutor", "<init>", "(Lorg/apache/openjpa/kernel/StoreQuery$Executor;Lorg/apache/openjpa/meta/ClassMetaData;ZLorg/apache/openjpa/kernel/FetchConfiguration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsAbstractExecutors", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "supportsAbstractExecutors", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresCandidateType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "requiresCandidateType", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresParameterDeclarations", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "requiresParameterDeclarations", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsParameterDeclarations", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "supportsParameterDeclarations", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery", "evaluate", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/OpenJPAStateManager;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;Lorg/apache/openjpa/datacache/QueryKey;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "checkCache", "(Lorg/apache/openjpa/datacache/QueryKey;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;Lorg/apache/openjpa/lib/rop/ResultObjectProvider;Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "wrapResult", "(Lorg/apache/openjpa/lib/rop/ResultObjectProvider;Lorg/apache/openjpa/datacache/QueryKey;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "fromObjectId", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "copyProjection", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreContext;Lorg/apache/openjpa/kernel/FetchConfiguration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;)Lorg/apache/openjpa/datacache/QueryCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_cache", "Lorg/apache/openjpa/datacache/QueryCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/openjpa/datacache/QueryCacheStoreQuery;)Lorg/apache/openjpa/kernel/StoreContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/datacache/QueryCacheStoreQuery", "_sctx", "Lorg/apache/openjpa/kernel/StoreContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

import BoardEditor from "./components/BoardEditor";
import BoardFileList from "./components/BoardFileList"
import ProFileUpload from "./components/ProFileUpload"

function App() {
  const exampleBoardId = 2; // 샘플용 게시글 id

  return (
    <div style={{ padding: 24}}>
      <h2>프로필 업로드</h2>
      <ProFileUpload />

      <hr style={{ margin: '24px 0'}} />

      <h2>게시글 작성 (새글)</h2>
      <BoardEditor mode="create" boardId={exampleBoardId} onSaved={() => console.log("create")}/>

      <hr style={{ margin: '24px 0'}} />
      <BoardEditor 
        mode="edit" 
        onSaved={(id) => console.log("saved", id)}
        boardId={exampleBoardId}
      />

      <h2>게시글 편집 (첨부파일수정 예시)</h2>

      <hr style={{ margin: '24px 0'}} />

      <h2>게시글 첨부파일 목록</h2>
      <BoardFileList boardId={exampleBoardId} onChange={() => console.log("changed")} />
      
    </div>
  )
}

export default App
